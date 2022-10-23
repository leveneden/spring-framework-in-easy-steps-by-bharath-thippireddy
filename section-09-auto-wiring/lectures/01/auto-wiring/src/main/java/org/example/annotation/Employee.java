package org.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    private Address address;

    public Address getAddress() {
        return address;
    }

    @Autowired
    public Employee setAddress(@Qualifier("fromSoftwareAddress") Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
