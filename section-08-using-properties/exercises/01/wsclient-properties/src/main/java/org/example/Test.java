package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            String url = springContext.getBean("url", String.class);
            String username = springContext.getBean("username", String.class);
            String password = springContext.getBean("password", String.class);
            System.out.println("url="+url);
            System.out.println("userName="+username);
            System.out.println("password="+password);
        }
    }
}
