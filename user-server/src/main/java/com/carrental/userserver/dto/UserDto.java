package com.carrental.userserver.dto;

import com.carrental.userserver.model.UserRole;
import lombok.Data;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private UserRole userRole;

}
