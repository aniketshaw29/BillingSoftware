package com.example.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billingsoftware.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {

}
