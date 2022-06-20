package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.DeliveryPersonnel;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.service.DeliveryService;

@Service
public class DeliveryServiceImpl implements DeliveryService {

	@Override
	public List<DeliveryPersonnel> getAllDeliveryPersonnels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeliveryPersonnel createDeliveryPersonnel(DeliveryPersonnel deliveryPersonnel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeliveryPersonnel getDeliveryPersonnelById(long id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllDeliveryPersonnel() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDeliveryPersonnelById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DeliveryPersonnel updateDeliveryPersonnel(long id, DeliveryPersonnel updatedDeliveryPersonnel) {
		// TODO Auto-generated method stub
		return null;
	}

}
