package com.example.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billingsoftware.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
