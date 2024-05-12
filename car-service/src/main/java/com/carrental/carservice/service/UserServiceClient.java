package com.carrental.carservice.service;

import com.carrental.carservice.dto.BookDto;
import com.carrental.carservice.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "user-service")
public interface UserServiceClient {
    @GetMapping("/api/v1/auth/user/{userId}")
    UserDto getUserById(@PathVariable("userId") Long userId);
}
