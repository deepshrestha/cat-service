package com.cibt.catserviceapp.controllers.rest;

import java.util.List;

import com.cibt.catserviceapp.models.Product;
import com.cibt.catserviceapp.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductAPIController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public List<Product> index() {
        return productRepository.findAll();
    }

    @PostMapping("/add")
    public Product addCategory(@RequestBody Product product) {
        return productRepository.save(product);
    }
}