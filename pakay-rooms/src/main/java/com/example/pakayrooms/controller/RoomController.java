package com.example.pakayrooms.controller;

import java.util.List;
import com.example.pakayrooms.model.Room;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pakayrooms.service.ImpRoomService;

@RestController
@RequestMapping("api/room")
public class RoomController {
    
    @Autowired
    private ImpRoomService roomService;

    @GetMapping
    public List<Room> getBookings() {
        return roomService.findAll();
    }
}
