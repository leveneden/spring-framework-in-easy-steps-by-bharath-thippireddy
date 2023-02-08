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
}
