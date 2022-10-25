package org.example;

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
