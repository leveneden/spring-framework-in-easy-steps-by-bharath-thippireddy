package org.example.service;

import org.example.dao.Dao;

public class Service {

    private Dao dao;

    public Service(final Dao dao) {
        this.dao = dao;
    }

    public void save() {
        dao.create();
    }

    public void initialize() {
        System.out.println("Instantiating Service bean");
    }

    public void destroy() {
        System.out.println("Discarding Service bean");
    }
}
