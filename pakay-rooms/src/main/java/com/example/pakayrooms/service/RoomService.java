package com.example.pakayrooms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pakayrooms.model.Room;
import com.example.pakayrooms.repository.RoomRepository;

@Service
public class RoomService implements ImpRoomService{

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public List<Room> findAll() {
        return (List<Room>) roomRepository.findAll();
    }
}
