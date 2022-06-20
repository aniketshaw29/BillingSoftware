package com.example.billingsoftware.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.billingsoftware.entity.OrderDetails;
import com.example.billingsoftware.exception.ResourceNotFoundException;

@Component
public interface OrderDetailsService {
	//add method you want and implement it in serviceimpl using repository
	
	List<OrderDetails> getAllOrderDetailsById(); 
	
 	List<OrderDetails> getAllOrderDetailsByOrderId();  //search by foreign key
 	
 	OrderDetails createOrderDetails(OrderDetails orderDetails);
 	
 	OrderDetails getOrderDetailsById(long id) throws ResourceNotFoundException;
 	
 	void deleteAllOrderDetails();
 	
 	void deleteAllOrderDetailsByOrderId(); //Delete by foreign key
 	
 	void deleteOrderDetailsById(long id);

 	OrderDetails updateOrderDetails(long id, OrderDetails updatedOrderDetails);
}
