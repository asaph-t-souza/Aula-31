package com.t3.onetomanybi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.t3.onetomanybi.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {
    List<Cart> findByColorIgnoreCase(String color);
}
