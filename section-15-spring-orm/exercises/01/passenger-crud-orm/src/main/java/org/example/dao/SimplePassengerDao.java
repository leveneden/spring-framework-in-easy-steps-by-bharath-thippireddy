package org.example.dao;

import org.example.entity.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class SimplePassengerDao implements PassengerDao {

    private HibernateTemplate hibernate;

    @Autowired
    public SimplePassengerDao setHibernate(HibernateTemplate hibernate) {
        this.hibernate = hibernate;
        return this;
    }

    @Override
    @Transactional
    public int create(Passenger passenger) {
        return (int) hibernate.save(passenger);
    }

    @Override
    @Transactional
    public void update(Passenger passenger) {
        hibernate.update(passenger);
    }

    @Override
    @Transactional
    public void delete(Passenger passenger) {
        hibernate.delete(passenger);
    }

    @Override
    @Transactional
    public void deleteAll() {
        hibernate.deleteAll(readAll());
    }

    @Override
    public Passenger read(int id) {
        return hibernate.get(Passenger.class, id);
    }

    @Override
    @Transactional
    public List<Passenger> readAll() {
        return hibernate.loadAll(Passenger.class);
    }
}
