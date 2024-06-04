package com.jalgp.di.springbootdi.services;

import com.jalgp.di.springbootdi.models.Product;
import com.jalgp.di.springbootdi.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    ProductRepository productRepository = new ProductRepository();

    public List<Product> findAll() {
        return productRepository.findall().stream().map(p -> {
            Double tax = p.getPrice() * 1.25d;
            /*Product newProduct = new Product(p.getId(), p.getName(), priceImp.longValue());*/
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(tax.longValue());
            return newProduct;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return productRepository.findById(id);
    }
}
