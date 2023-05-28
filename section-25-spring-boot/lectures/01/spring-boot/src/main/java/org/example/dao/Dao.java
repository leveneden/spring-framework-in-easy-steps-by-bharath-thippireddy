package org.example.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Dao {

    private static final Logger logger = LoggerFactory.getLogger(Dao.class);

    public void create() {
        logger.info("Persisting object in nonexistent database.");
    }
}
