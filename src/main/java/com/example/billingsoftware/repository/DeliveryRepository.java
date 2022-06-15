package com.example.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billingsoftware.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {

}
