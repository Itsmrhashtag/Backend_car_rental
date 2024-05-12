package com.carrental.bookservice.model;

import com.carrental.bookservice.dto.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fromDate;
    private Date toDate;
    private Long days;
    private Long price;
    private BookingStatus bookingStatus;
    private Long userId;
    private Long carId;
    private String username;
    private String email;
//    public BookDto getBookCarDto() {
//        BookDto bookDto = new BookDto();
//        bookDto.setId(id);
//        bookDto.setDays(days);
//        bookDto.setBookingStatus(bookingStatus);
//        bookDto.setPrice(price);
//        bookDto.setToDate(toDate);
//        bookDto.setFromDate(fromDate);
//        bookDto.setEmail(UserDto.getEmail());
//        bookDto.setUsername(user.getName());
//        bookDto.setUserId(user.getId());
//        bookDto.setCarId(car.getId());
//        return bookDto;
//    }
}
