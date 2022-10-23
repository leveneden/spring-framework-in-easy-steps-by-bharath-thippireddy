package org.example;

import org.springframework.beans.factory.annotation.Required;

public class Location {
    private String street;
    private int streetNumber;

    public String getStreet() {
        return street;
    }

    @Required
    public Location setStreet(String street) {
        this.street = street;
        return this;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    @Required
    public Location setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" +
                street + " " + streetNumber +
                '}';
    }
}
