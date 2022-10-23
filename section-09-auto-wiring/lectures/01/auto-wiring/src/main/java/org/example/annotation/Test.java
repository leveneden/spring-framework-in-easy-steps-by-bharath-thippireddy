package org.example.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("org/example/annotation/springconfig.xml")) {
            Employee employee = springContext.getBean("employee", Employee.class);
            System.out.println(employee);
        }
    }
}
