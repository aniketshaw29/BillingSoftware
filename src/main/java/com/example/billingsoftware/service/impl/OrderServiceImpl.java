package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.Order;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.repository.OrderRepository;
import com.example.billingsoftware.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}

	@Override
	public Order createOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Order getOrderById(long id) throws ResourceNotFoundException {
		return orderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order does'nt exist with id: " + id));
	}

	@Override
	public void deleteAllOrders() {
		orderRepository.deleteAll();
	}

	@Override
	public void deleteOrderById(long id) {
		orderRepository.deleteById(id);
	}

	@Override
	public Order updateCustomersID(long id, Order updatedOrder) {
		Order oldOrder = getOrderById(id);
		oldOrder.setO_c_id(updatedOrder.getO_c_id());
		return oldOrder;
	}

}
