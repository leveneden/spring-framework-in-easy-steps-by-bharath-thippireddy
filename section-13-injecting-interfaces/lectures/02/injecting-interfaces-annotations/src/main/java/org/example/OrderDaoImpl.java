package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderDaoImpl implements OrderDao {

    @Override
    public String toString() {
        return "OrderDaoImpl{}";
    }

    @Override
    public void createOrder() {
        System.out.println("Inside OrderDaoImpl - createOrder()");
    }
}
