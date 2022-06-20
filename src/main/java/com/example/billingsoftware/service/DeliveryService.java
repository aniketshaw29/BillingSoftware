package com.example.billingsoftware.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.billingsoftware.entity.DeliveryPersonnel;
import com.example.billingsoftware.exception.ResourceNotFoundException;

@Component
public interface DeliveryService {
	//add method you want and implement it in serviceimpl using repository
	
 	List<DeliveryPersonnel> getAllDeliveryPersonnels();
 	
 	DeliveryPersonnel createDeliveryPersonnel(DeliveryPersonnel deliveryPersonnel);
 	
 	DeliveryPersonnel getDeliveryPersonnelById(long id) throws ResourceNotFoundException;
 	
 	void deleteAllDeliveryPersonnel();
 	
 	void deleteDeliveryPersonnelById(long id);

 	DeliveryPersonnel updateDeliveryPersonnel(long id, DeliveryPersonnel updatedDeliveryPersonnel);
}
