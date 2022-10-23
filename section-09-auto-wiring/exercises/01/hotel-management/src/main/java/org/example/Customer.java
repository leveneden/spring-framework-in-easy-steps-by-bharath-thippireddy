package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
    private String name;
    private Reservation reservation;

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public Reservation getReservation() {
        return reservation;
    }

    @Autowired
    public Customer setReservation(@Qualifier("tomorrow") Reservation reservation) {
        this.reservation = reservation;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", reservation=" + reservation +
                '}';
    }
}
