package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

    private String movie;
    private float price;

    public String getMovie() {
        return movie;
    }

    public TicketReservation setMovie(String movie) {
        this.movie = movie;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public TicketReservation setPrice(float price) {
        this.price = price;
        return this;
    }

    @PostConstruct
    public void entrance() {
        System.out.println("Existentialism entered the American consciousness like an elephant entering a dark room: there was a good deal of breakage and the people inside naturally mistook the nature of the intrusion. What would it be? An engine of destruction perhaps, a tank left over from the war?");
    }

    @PreDestroy
    public void recognition() {
        System.out.println("After a while the lights were turned on and it was seen to be \"only\" an elephant; everyone laughed and said that a circus must be passing through town. But no, soon they found the elephant was here to stay; and then, looking closer, they saw that although he was indeed a newcomer, an odd-looking one at that, he was not a stranger: they had known him all along.");
    }

    @Override
    public String toString() {
        return "TicketReservation{" +
                "movie='" + movie + '\'' +
                ", price=" + price +
                '}';
    }
}
