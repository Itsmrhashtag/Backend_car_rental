package com.carrental.carservice.service;


import com.carrental.carservice.dto.BookDto;
import com.carrental.carservice.dto.CarDto;
import com.carrental.carservice.dto.CarListDto;
import com.carrental.carservice.dto.SearchDto;

import java.util.List;

public interface CustomerService {

    List<CarDto> getAllCars();

    boolean bookCar(BookDto bookDto);

    CarDto getCarById(Long carId);


    CarListDto searchCar(SearchDto searchDto);

}
