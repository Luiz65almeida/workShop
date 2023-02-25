package com.example.workShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workShop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


    
}
