package com.example.billingsoftware.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.billingsoftware.entity.Customer;
import com.example.billingsoftware.exception.ResourceNotFoundException;

@Component
public interface CustomerService {
		//add method you want and implement it in serviceimpl using repository
	
	 	List<Customer> getAllCustomers();
	 	
	 	Customer createCustomer(Customer customer);
	 	
	 	Customer getCustomerById(long id) throws ResourceNotFoundException;
	 	
	 	void deleteAllCustomer();
	 	
	 	void deleteCustomerById(long id);

		Customer updateCustomer(long id, Customer updatedCustomer);
	 	
}
