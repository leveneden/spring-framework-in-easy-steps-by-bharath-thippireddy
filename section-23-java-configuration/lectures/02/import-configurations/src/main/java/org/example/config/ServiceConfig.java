package org.example.config;

import org.example.dao.Dao;
import org.example.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public Service service(Dao dao) {
        return new Service(dao);
    }
}
