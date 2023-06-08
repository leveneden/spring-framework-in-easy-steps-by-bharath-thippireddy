package org.example.controller;

import org.example.entity.Product;
import org.example.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public record ProductController(ProductRepository repository) {

    @GetMapping
    public Iterable<Product> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable final Long id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Product save(@RequestBody final Product product) {
        return repository.save(product);
    }

    @PutMapping
    public Product update(@RequestBody final Product product) {
        return save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable final Long id) {
        repository.deleteById(id);
    }
}
