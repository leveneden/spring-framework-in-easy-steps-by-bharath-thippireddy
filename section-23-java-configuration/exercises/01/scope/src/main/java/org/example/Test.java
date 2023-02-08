package org.example;

import org.example.config.SpringConfig;
import org.example.dao.Dao;
import org.example.service.Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext(SpringConfig.class)) {
            System.out.println("Since Service has a prototype scope, the Spring context should retrieve a different" +
                    " instance in each bean request. Which is " +
                    (getServiceBean(springContext).hashCode() != getServiceBean(springContext).hashCode())
                    + "."
            );

            System.out.println("Since Dao has a singleton scope, the Spring context should retrieve the same" +
                    " instance in each bean request. Which is " +
                    (getDaoBean(springContext).hashCode() == getDaoBean(springContext).hashCode())
                    + "."
            );
        }
    }

    private static Service getServiceBean(AnnotationConfigApplicationContext springContext) {
        return springContext.getBean(Service.class);
    }

    private static Dao getDaoBean(AnnotationConfigApplicationContext springContext) {
        return springContext.getBean(Dao.class);
    }
}
