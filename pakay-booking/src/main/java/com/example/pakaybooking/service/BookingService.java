package com.example.pakaybooking.service;

import java.util.List;

import com.example.pakaybooking.model.Booking;
import com.example.pakaybooking.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.var;

@Service
public class BookingService implements ImpBookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> findAll() {
        return (List<Booking>) bookingRepository.findAll();
    }

    
}
