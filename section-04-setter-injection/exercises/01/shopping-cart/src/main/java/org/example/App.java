package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            ShoppingCart shoppingCart = springContext.getBean("shoppingCart", ShoppingCart.class);
            System.out.println(shoppingCart);
        }
    }
}
