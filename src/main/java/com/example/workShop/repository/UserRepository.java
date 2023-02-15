package com.example.workShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JPA <User, Long>   {
}
