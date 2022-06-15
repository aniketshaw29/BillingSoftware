package com.example.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billingsoftware.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
