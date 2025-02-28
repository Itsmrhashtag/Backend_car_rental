package com.carrental.userserver.dto;

import com.carrental.userserver.model.UserRole;
import lombok.Data;

@Data
public class AuthenticationResponse {

    private String jwt;
    private UserRole userRole;
    private Long userId;

}
