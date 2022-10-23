package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            Instructor instructor = springContext.getBean("instructor", Instructor.class);
            System.out.println(instructor);
        }
    }
}
