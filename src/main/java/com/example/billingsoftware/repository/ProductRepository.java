package com.example.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billingsoftware.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	//custom method
	//  with @query Annotation
}
