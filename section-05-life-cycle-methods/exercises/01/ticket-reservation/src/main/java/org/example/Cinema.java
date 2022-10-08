package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Cinema {
    public static void main( String[] args ) {
        try (ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("springconfig.xml")) {
            TicketReservation ticketReservation = springContext.getBean("ticketReservation", TicketReservation.class);
            System.out.println(ticketReservation);
        }
    }
}
