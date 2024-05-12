package com.carrental.carservice.dto;

import com.carrental.carservice.model.BookingStatus;
import lombok.Data;

import java.util.Date;

@Data
public class BookDto {

    private Long id;
    private Date fromDate;
    private Date toDate;
    private Long days;
    private Long price;
    private BookingStatus bookingStatus;
    private Long userId;
    private Long carId;
    private String username;
    private String email;

}
