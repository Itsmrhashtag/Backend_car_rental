package com.carrental.bookservice.dto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "car-service") // Name of the Car microservice
public interface CarServiceFeignClient {
    @GetMapping("/api/v1/admin/car/{carId}")
    CarDto getCarById(@PathVariable("carId") Long carId);
}