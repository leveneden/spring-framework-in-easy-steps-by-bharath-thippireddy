package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            Employee deepak = springContext.getBean("employee", Employee.class);
            System.out.printf("Employee id = %d%n", deepak.getId());
            System.out.printf("Employee name = %s%n", deepak.getName());
        }
    }
}
