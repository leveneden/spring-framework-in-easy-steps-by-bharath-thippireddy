package org.example.lifecycle.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            Patient patient = springContext.getBean("patientInterfaces", Patient.class);
            System.out.println(patient);
            springContext.registerShutdownHook(); // not necessary in my case for some reason
                                                  // but here it is
        }
    }
}
