package org.example.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            Hospital hospital = springContext.getBean("hospital", Hospital.class);
            System.out.printf("Hospital name = %s%n", hospital.getName());
            for (String department : hospital.getDepartments())
                System.out.printf("Hospital department = %s%n", department);
        }
    }
}
