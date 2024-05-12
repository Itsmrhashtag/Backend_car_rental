package com.carrental.carservice.service;

import com.carrental.carservice.dto.BookDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "book-service")
public interface BookingServiceClient {
    @GetMapping("/api/v1/bookings")
    List<BookDto> getAllBookings();

    @GetMapping("/api/v1/bookings/{bookingId}/{status}")
    ResponseEntity<?> changeBookingStatus(@PathVariable("bookingId") Long bookingId, @PathVariable("status") String status);

    @GetMapping("/user/{userId}")
    List<BookDto> getBookingByUserId(@PathVariable("userId") Long userId);
}
