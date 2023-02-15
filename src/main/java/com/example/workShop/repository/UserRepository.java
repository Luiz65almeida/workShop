package com.example.workShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.workShop.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
