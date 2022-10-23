package org.example;

import java.util.List;

public class ProductList {
    List<String> productNames;

    public List<String> getProductNames() {
        return productNames;
    }

    public ProductList setProductNames(List<String> productNames) {
        this.productNames = productNames;
        return this;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "productNames=" + productNames +
                '}';
    }
}
