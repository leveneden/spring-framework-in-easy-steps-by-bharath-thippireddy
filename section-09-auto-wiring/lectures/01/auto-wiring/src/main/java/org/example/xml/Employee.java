package org.example.xml;

public class Employee {
    private Address address;

    public Employee(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Employee setAddress(Address address) {
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
