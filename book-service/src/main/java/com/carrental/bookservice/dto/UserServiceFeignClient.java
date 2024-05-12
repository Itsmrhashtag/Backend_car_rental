package com.carrental.bookservice.dto;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service") // Name of the User microservice
public interface UserServiceFeignClient {
    @GetMapping("/api/v1/auth/user/{userId}")
    UserDto getUserById(@PathVariable("userId") Long userId);


}
