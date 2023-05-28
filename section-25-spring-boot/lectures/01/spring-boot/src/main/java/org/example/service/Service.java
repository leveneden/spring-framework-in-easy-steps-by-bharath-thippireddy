package org.example.service;

import org.example.dao.Dao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {

    private static final Logger logger = LoggerFactory.getLogger(Service.class);
    private final Dao dao;

    @Autowired
    public Service(Dao dao) {
        logger.info("A Service bean has been instantiated.");
        this.dao = dao;
    }

    public void save() {
        dao.create();
    }
}
