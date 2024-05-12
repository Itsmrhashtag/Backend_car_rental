package com.carrental.bookservice.dto;

import com.carrental.bookservice.model.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private UserRole userRole;

}
