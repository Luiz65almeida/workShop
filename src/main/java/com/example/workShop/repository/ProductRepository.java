package com.example.workShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workShop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}