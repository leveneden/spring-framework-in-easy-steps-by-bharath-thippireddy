package org.example.map;

import java.util.Map;

public class Customer {
    private int id;
    private Map<Integer, String> products;

    public int getId() {
        return id;
    }

    public Customer setId(int id) {
        this.id = id;
        return this;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public Customer setProducts(Map<Integer, String> products) {
        this.products = products;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
