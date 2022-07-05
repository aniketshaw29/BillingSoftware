package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.DeliveryPersonnel;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.repository.DeliveryRepository;
import com.example.billingsoftware.service.DeliveryService;

@Service
public class DeliveryServiceImpl implements DeliveryService {
	@Autowired
	private DeliveryRepository deliveryRepository;
	
	@Override
	public List<DeliveryPersonnel> getAllDeliveryPersonnels() {
		return deliveryRepository.findAll();
	}

	@Override
	public DeliveryPersonnel createDeliveryPersonnel(DeliveryPersonnel deliveryPersonnel) {
		return deliveryRepository.save(deliveryPersonnel);
	}

	@Override
	public DeliveryPersonnel getDeliveryPersonnelById(long id) throws ResourceNotFoundException {
		return deliveryRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Delivery Personnel does'nt exist with id: " + id));
	}

	@Override
	public void deleteAllDeliveryPersonnel() {
		deliveryRepository.deleteAll();
	}

	@Override
	public void deleteDeliveryPersonnelById(long id) {
		DeliveryPersonnel deliveryPersonnel = getDeliveryPersonnelById(id);
		deliveryRepository.delete(deliveryPersonnel);
	}

	@Override
	public DeliveryPersonnel updateDeliveryPersonnel(long id, DeliveryPersonnel updatedDeliveryPersonnel) {
		DeliveryPersonnel oldDeliveryPersonnel = getDeliveryPersonnelById(id);
		oldDeliveryPersonnel.setD_aadharNumber(updatedDeliveryPersonnel.getD_aadharNumber());
		oldDeliveryPersonnel.setD_name(updatedDeliveryPersonnel.getD_name());
		oldDeliveryPersonnel.setD_phone(updatedDeliveryPersonnel.getD_phone());
		oldDeliveryPersonnel.setD_vehicleNumber(updatedDeliveryPersonnel.getD_vehicleNumber());
		return deliveryRepository.save(oldDeliveryPersonnel);
	}

}
