package com.example.pakayrooms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pakayrooms.model.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long>{
    
}
