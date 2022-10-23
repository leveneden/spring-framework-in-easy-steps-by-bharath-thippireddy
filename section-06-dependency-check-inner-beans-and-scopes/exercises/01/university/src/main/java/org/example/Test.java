package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            University stanford = springContext.getBean("university", University.class);
            System.out.println(stanford);

            boolean retrievingPrototypesGiveOutDifferentHashCodes =
                    springContext.getBean("university", University.class).hashCode() != springContext.getBean("university", University.class).hashCode();
            System.out.println("When retrieving multiple university beans from the spring container, since university is a prototype, " +
                    "their hash code must be different.\nThat " + ((retrievingPrototypesGiveOutDifferentHashCodes) ? "is":"isn't") + " the case.");
        }
    }
}
