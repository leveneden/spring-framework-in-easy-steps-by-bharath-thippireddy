package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderBoImpl implements OrderBo {

    private OrderDao dao;

    public OrderDao getDao() {
        return dao;
    }

    @Autowired
    public OrderBoImpl setDao(@Qualifier("alternativeOrderDaoImpl") OrderDao dao) {
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
