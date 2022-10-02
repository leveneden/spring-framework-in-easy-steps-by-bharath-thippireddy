package org.example.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            CountriesAndLanguages countriesAndLanguages = springContext.getBean("countriesAndLanguages", CountriesAndLanguages.class);
            System.out.println(countriesAndLanguages);
        }
    }
}
