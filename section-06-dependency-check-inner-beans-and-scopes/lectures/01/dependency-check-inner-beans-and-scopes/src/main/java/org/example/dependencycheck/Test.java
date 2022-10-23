package org.example.dependencycheck;

import org.example.dependencycheck.Prescription;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            Prescription prescription = springContext.getBean("prescription", Prescription.class);
            System.out.println(prescription);
        }
    }
}
