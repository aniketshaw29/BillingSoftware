package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.OrderDetails;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.repository.OrderDetailsRepository;
import com.example.billingsoftware.service.OrderDetailsService;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	@Override
	public List<OrderDetails> getAllOrderDetailsById() {
		return orderDetailsRepository.findAll();
	}

	@Override
	public List<OrderDetails> getAllOrderDetailsByOrderId() {
		// left to do coz of foreign key
		return null;
	}

	@Override
	public OrderDetails createOrderDetails(OrderDetails orderDetails) {
		return orderDetailsRepository.save(orderDetails);
	}

	@Override
	public OrderDetails getOrderDetailsById(long id) throws ResourceNotFoundException {
		return orderDetailsRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order details does'nt exist with id: " + id));
	}

	@Override
	public void deleteAllOrderDetails() {
		orderDetailsRepository.deleteAll();
	}

	@Override
	public void deleteAllOrderDetailsByOrderId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrderDetailsById(long id) {
		orderDetailsRepository.deleteById(id);
	}

	@Override
	public OrderDetails updateOrderDetails(long id, OrderDetails updatedOrderDetails) {
		OrderDetails oldOrderDetails = getOrderDetailsById(id);
		oldOrderDetails.setOd_o_id(updatedOrderDetails.getOd_o_id());
		oldOrderDetails.setOd_p_id(updatedOrderDetails.getOd_p_id());
		oldOrderDetails.setOd_quantity(updatedOrderDetails.getOd_quantity());
		//subtotal will be recalculated with quantity*product_rate
		return oldOrderDetails;
	}

}
