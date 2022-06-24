package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.Order;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(long id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllOrders() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrderById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order updateCustomer(long id, Order updatedOrder) {
		// TODO Auto-generated method stub
		return null;
	}

}
