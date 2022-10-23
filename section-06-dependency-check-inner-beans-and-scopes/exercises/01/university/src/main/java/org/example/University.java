package org.example;

import org.springframework.beans.factory.annotation.Required;

public class University {
    private int id;
    private String name;
    private Location location;

    public int getId() {
        return id;
    }

    @Required
    public University setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public University setName(String name) {
        this.name = name;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public University setLocation(Location location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                '}';
    }
}
