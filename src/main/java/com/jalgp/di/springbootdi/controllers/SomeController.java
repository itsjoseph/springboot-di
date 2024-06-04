package com.jalgp.di.springbootdi.controllers;

import com.jalgp.di.springbootdi.models.Product;
import com.jalgp.di.springbootdi.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductService service = new ProductService();

    @GetMapping()
    public List<Product> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product porId(@PathVariable Long id) {
        return service.findById(id);
    }
}
