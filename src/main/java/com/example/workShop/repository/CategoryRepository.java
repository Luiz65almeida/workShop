package com.example.workShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workShop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
