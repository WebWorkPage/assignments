package com.example.Spring_Ioc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring_Ioc.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategory(String category);
}
