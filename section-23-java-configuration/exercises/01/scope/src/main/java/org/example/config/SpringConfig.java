package org.example.config;

import org.example.dao.Dao;
import org.example.service.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Configuration
public class SpringConfig {

    @Bean
    @Scope(SCOPE_SINGLETON)
    public Dao dao() {
        return new Dao();
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public Service service(Dao dao) {
        return new Service(dao);
    }
}
