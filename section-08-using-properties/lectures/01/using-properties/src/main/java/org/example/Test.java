package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            MyDao dao = springContext.getBean("myDao", MyDao.class);
            System.out.println(dao);
        }
    }
}
