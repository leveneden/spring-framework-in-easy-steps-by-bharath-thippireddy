package org.example.dao;

import org.example.entity.Product;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class SimpleProductDao implements ProductDao {

    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public SimpleProductDao setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
        return this;
    }

    @Override
    @Transactional
    public int create(Product product) {
        return (int) hibernateTemplate.save(product);
    }

    @Override
    @Transactional
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    public Optional<Product> find(int id) {
        return Optional.ofNullable(hibernateTemplate.get(Product.class, id));
    }

    @Override
    public List<Product> findAll() {
        return hibernateTemplate.loadAll(Product.class);
    }
}
