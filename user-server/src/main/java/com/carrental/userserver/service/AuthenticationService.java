package com.carrental.userserver.service;


import com.carrental.userserver.dto.RegisterRequest;
import com.carrental.userserver.dto.UserDto;

public interface AuthenticationService {

    UserDto createCustomer(RegisterRequest registerRequest);
    boolean hasCustomerWithEmail(String email);

}
