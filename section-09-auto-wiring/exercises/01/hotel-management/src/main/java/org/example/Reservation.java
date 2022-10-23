package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Reservation {
    private int id;
    private String time;

    public int getId() {
        return id;
    }

    public Reservation setId(int id) {
        this.id = id;
        return this;
    }

    public String getTime() {
        return time;
    }

    @Autowired
    public Reservation setTime(@Qualifier("tomorrow") String time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", time='" + time + '\'' +
                '}';
    }
}
