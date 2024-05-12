package com.carrental.carservice.controller;

import com.carrental.carservice.dto.BookDto;
import com.carrental.carservice.dto.CarDto;
import com.carrental.carservice.dto.SearchDto;
import com.carrental.carservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    // get all cars
    @GetMapping("/cars")
    public ResponseEntity<List<CarDto>> getAllCars(){
        List<CarDto> carDtoList = customerService.getAllCars();
        return ResponseEntity.ok(carDtoList);
    }
    // get car by id
    @GetMapping("/car/{carId}")
    public ResponseEntity<CarDto> getCarById(@PathVariable Long carId) {
        CarDto carDto = customerService.getCarById(carId);
        if (carDto == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(carDto);
    }


    // search for car
    @PostMapping("/car/search")
    public ResponseEntity<?> search(@RequestBody SearchDto searchDto) {
        return ResponseEntity.ok(customerService.searchCar(searchDto));
    }

}
