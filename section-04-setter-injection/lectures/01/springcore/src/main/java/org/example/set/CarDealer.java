package org.example.set;

import java.util.Set;

public class CarDealer {
    private String name;
    private Set<String> models;

    public String getName() {
        return name;
    }

    public CarDealer setName(String name) {
        this.name = name;
        return this;
    }

    public Set<String> getModels() {
        return models;
    }

    public CarDealer setModels(Set<String> models) {
        this.models = models;
        return this;
    }
}
