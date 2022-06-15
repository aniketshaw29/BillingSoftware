package com.example.billingsoftware.service;

import java.util.List;

import com.example.billingsoftware.entity.Customer;
import com.example.billingsoftware.exception.ResourceNotFoundException;

public interface CustomerService {
	
	 	List<Customer> getAllCustomers();
	 	
	 	Customer createCustomer(Customer customer);
	 	
	 	Customer getCustomerById(long id) throws ResourceNotFoundException;
	 	
	 	void deleteAllCustomer();
	 	
	 	void deleteCustomerById(long id);

		Customer updateCustomer(long id, Customer updatedCustomer);
	 	
}
