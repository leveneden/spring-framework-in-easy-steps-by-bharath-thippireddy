package org.example;

import org.example.service.MultiplyService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            MultiplyService multiplyService = springContext.getBean("multiplyService", MultiplyService.class);
            System.out.println(multiplyService.multiply(4, 5));
        }
    }
}
