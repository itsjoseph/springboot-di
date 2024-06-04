package com.jalgp.di.springbootdi.repositories;

import com.jalgp.di.springbootdi.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(new Product(1L, "Memoria", 300L),
                new Product(2L, "Celular", 50L),
                new Product(3L, "Cámara", 180L),
                new Product(4L, "Modem", 490L));
    }

    public List<Product> findall() {
        return data;
    }

    public Product findById(Long id) {
        return data.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }
}
