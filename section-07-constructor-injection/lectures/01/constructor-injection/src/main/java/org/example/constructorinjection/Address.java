package org.example.constructorinjection;

public class Address {
    private int houseNumber;
    private String street;
    private String city;

    public int getHouseNumber() {
        return houseNumber;
    }

    public Address setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Address setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", Street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
