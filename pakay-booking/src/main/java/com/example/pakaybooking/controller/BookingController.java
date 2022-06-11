package com.example.pakaybooking.controller;

import java.util.List;

import com.example.pakaybooking.model.Booking;
import com.example.pakaybooking.service.ImpBookingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
@RequestMapping("api/booking")
public class BookingController {
    @Autowired
    private ImpBookingService bookingService;

    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.findAll();
    }
}
