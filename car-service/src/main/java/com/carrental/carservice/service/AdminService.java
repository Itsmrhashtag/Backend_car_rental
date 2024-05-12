package com.carrental.carservice.service;


import com.carrental.carservice.dto.BookDto;
import com.carrental.carservice.dto.CarDto;
import com.carrental.carservice.dto.CarListDto;
import com.carrental.carservice.dto.SearchDto;

import java.io.IOException;
import java.util.List;

public interface AdminService {

    boolean addCar(CarDto carDto) throws IOException;

    List<CarDto> getAllCars();

    void deleteCar(Long id);

    CarDto getCarById(Long id);

    boolean updateCar(Long carId, CarDto carDto) throws IOException;

    List<BookDto> getBookings();

    boolean changeBookingStatus(Long bookingId, String status);

    CarListDto searchCar(SearchDto searchDto);

}
