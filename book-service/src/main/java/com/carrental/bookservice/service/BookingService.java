package com.carrental.bookservice.service;

import com.carrental.bookservice.dto.*;
import com.carrental.bookservice.model.Book;
import com.carrental.bookservice.model.BookingStatus;
import com.carrental.bookservice.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
public class BookingService {

    @Autowired
    private BookRepository bookRepository;
    private final UserServiceFeignClient userServiceFeignClient;
    private final CarServiceFeignClient carServiceFeignClient;

    // Constructor injection
    public BookingService(UserServiceFeignClient userServiceFeignClient, CarServiceFeignClient carServiceFeignClient) {
        this.userServiceFeignClient = userServiceFeignClient;
        this.carServiceFeignClient = carServiceFeignClient;
    }

    public List<Book> getBookingByUserId(Long userId){
        return bookRepository.findAllByUserId(userId);
    }
    public List<Book> getAllBooking(){
        return bookRepository.findAll();
    }

    public boolean bookCar(BookDto bookDto){
        CarDto optionalCar = carServiceFeignClient.getCarById(bookDto.getCarId());
        UserDto optionalUser = userServiceFeignClient.getUserById(bookDto.getUserId());



        if (optionalCar!= null && optionalUser!= null) {
            CarDto existingCar = optionalCar;
            UserDto existingUser = optionalUser;
            Book book = new Book();
            book.setUserId(optionalUser.getId());
            book.setUsername(existingUser.getName());
            book.setEmail(existingUser.getEmail());
            book.setCarId(existingCar.getId());
            book.setBookingStatus(BookingStatus.PENDING);
            long diffInMilliSeconds = bookDto.getToDate().getTime() - bookDto.getFromDate().getTime();
            long days = TimeUnit.MILLISECONDS.toDays(diffInMilliSeconds);
            book.setDays(days);
            book.setPrice(existingCar.getPrice() * days);
            book.setFromDate(bookDto.getFromDate());
            book.setToDate(bookDto.getToDate());
            bookRepository.save(book);
            return true;
        }
        return false;

    }

}
