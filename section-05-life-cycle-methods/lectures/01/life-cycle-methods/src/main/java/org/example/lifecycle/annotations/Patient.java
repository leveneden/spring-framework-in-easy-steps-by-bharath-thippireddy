package org.example.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public Patient setId(int id) {
        this.id = id;
        return this;
    }

    @PostConstruct
    public void entrance() {
        System.out.println("All the world is a stage, and all the men and women merely players. They have their exits and their entrances.");
    }

    @PreDestroy
    public void exit() {
        System.out.println("And one man in its time plays many parts.");
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                '}';
    }
}
