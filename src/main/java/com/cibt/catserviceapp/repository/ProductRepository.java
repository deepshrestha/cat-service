package com.cibt.catserviceapp.repository;

import com.cibt.catserviceapp.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}