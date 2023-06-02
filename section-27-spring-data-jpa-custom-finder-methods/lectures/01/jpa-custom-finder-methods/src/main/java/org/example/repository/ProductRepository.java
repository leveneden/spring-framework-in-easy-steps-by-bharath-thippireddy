package org.example.repository;

import org.example.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByPrice(Double price);
    List<Product> findByNameAndPrice(String name, Double price);
}
