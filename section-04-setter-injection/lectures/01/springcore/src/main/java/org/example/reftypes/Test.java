package org.example.reftypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            Student student = springContext.getBean("student", Student.class);
            System.out.println(student);
        }
    }
}
