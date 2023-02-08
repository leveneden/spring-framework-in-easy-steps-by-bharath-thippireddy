package org.example.dao;

public class Dao {

    public void create() {
        System.out.println("Created");
    }

    public void initialize() {
        System.out.println("Instantiating Dao bean");
    }

    public void destroy() {
        System.out.println("Discarding Dao bean");
    }
}
