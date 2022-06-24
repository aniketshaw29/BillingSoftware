package com.example.billingsoftware.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.billingsoftware.entity.Order;
import com.example.billingsoftware.exception.ResourceNotFoundException;

@Component
public interface OrderService {
	List<Order> getAllOrder();
 	
	Order createOrder(Order order);
 	
	Order getOrderById(long id) throws ResourceNotFoundException;
 	
 	void deleteAllOrders();
 	
 	void deleteOrderById(long id);

 	Order updateCustomer(long id, Order updatedOrder);	 
}
