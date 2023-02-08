package org.example;

import org.example.config.SpringConfig;
import org.example.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            Service service = springContext.getBean(Service.class);
            service.save();
        }
    }
}
