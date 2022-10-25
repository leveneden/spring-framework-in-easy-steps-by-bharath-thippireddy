package org.example;

public class OrderBoImpl implements OrderBo {

    private OrderDao dao;

    public OrderDao getDao() {
        return dao;
    }

    public OrderBoImpl setDao(OrderDao dao) {
        this.dao = dao;
        return this;
    }

    @Override
    public String toString() {
        return "OrderBoImpl{" +
                "dao=" + dao +
                '}';
    }

    @Override
    public void placeOrder() {
        System.out.println("Inside OrderBoImpl - placeOrder()");
        dao.createOrder();
    }
}
