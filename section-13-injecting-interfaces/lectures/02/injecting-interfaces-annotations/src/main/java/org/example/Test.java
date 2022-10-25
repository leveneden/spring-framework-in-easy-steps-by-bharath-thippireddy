package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            OrderBo orderBo = springContext.getBean("orderBoImpl", OrderBo.class);
            System.out.println(orderBo);
            orderBo.placeOrder();
        }
    }
}
