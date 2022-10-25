package org.example;

import org.springframework.stereotype.Component;

@Component
public class AlternativeOrderDaoImpl implements OrderDao {

    @Override
    public String toString() {
        return "AlternativeOrderDaoImpl{}";
    }

    @Override
    public void createOrder() {
        System.out.println("Inside AlternativeOrderDaoImpl - createOrder()");
    }
}
