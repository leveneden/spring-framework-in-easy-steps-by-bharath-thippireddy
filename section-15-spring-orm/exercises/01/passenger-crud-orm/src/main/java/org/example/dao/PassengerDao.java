package org.example.dao;

import org.example.entity.Passenger;

import java.util.List;

public interface PassengerDao {
    int create(Passenger passenger);
    void update(Passenger passenger);
    void delete(Passenger passenger);
    void deleteAll();
    Passenger read(int id);
    List<Passenger> readAll();
}
