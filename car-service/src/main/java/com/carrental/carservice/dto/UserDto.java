package com.carrental.carservice.dto;

import com.carrental.carservice.model.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private UserRole userRole;

}
