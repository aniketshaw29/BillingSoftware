package com.example.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.billingsoftware.entity.DeliveryPersonnel;

public interface DeliveryRepository extends JpaRepository<DeliveryPersonnel, Long> {
	//custom method
	//  with @query Annotation
}
