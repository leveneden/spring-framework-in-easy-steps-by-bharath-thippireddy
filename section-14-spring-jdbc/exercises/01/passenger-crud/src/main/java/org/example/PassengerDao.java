package org.example;

import java.util.List;

public interface PassengerDao {
    int create(Passenger employee);
    int update(Passenger employee);
    int delete(int id);
    Passenger read(int id);
    List<Passenger> read();
}
