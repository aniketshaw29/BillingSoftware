package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.OrderDetails;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

	@Override
	public List<OrderDetails> getAllOrderDetailsById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetails> getAllOrderDetailsByOrderId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails createOrderDetails(OrderDetails orderDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderDetails getOrderDetailsById(long id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllOrderDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllOrderDetailsByOrderId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrderDetailsById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderDetails updateOrderDetails(long id, OrderDetails updatedOrderDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
