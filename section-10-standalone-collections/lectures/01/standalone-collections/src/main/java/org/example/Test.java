package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            ProductList productList = springContext.getBean("productList", ProductList.class);
            System.out.println(productList);
        }
    }
}
