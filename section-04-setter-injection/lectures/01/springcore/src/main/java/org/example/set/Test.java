package org.example.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            CarDealer cardealer = springContext.getBean("cardealer", CarDealer.class);
            System.out.printf("Car Dealer name = %s%n", cardealer.getName());
            for (String department : cardealer.getModels())
                System.out.printf("Car model = %s%n", department);
        }
    }
}
