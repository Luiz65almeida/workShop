package com.example.workShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workShop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
