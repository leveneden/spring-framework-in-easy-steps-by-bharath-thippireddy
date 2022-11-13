package org.example.dao;

import org.example.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductDao {

    int create(Product product);
    void update(Product product);
    void delete(Product product);
    Optional<Product> find(int id);
    List<Product> findAll();
}
