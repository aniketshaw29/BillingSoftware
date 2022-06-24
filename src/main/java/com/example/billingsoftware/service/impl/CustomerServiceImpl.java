package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.Customer;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.repository.CustomerRepository;
import com.example.billingsoftware.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerById(long id) throws ResourceNotFoundException{ //exception to be handled in controller
		return customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer does'nt exist with id: " + id));
		/*
		 * customerRepository.findById(id); 
		 * return customer object if found with that id
		 * else returning optional empty()
		*/
	}

	@Override
	public Customer updateCustomer(long id, Customer updatedCustomer) {
		Customer oldCustomer =  getCustomerById(id);
		oldCustomer.setC_name(updatedCustomer.getC_name());
		oldCustomer.setC_phone(updatedCustomer.getC_phone());
		oldCustomer.setEmail(updatedCustomer.getEmail());
		oldCustomer.setC_address_street_name(updatedCustomer.getC_address_street_name());
		oldCustomer.setC_address_landmark(updatedCustomer.getC_address_landmark());
		oldCustomer.setC_address_district(updatedCustomer.getC_address_district());
		oldCustomer.setC_address_state(updatedCustomer.getC_address_state());
		oldCustomer.setC_address_pincode(updatedCustomer.getC_address_pincode());
		oldCustomer.setC_upi_id(updatedCustomer.getC_upi_id());
		return customerRepository.save(oldCustomer);
	}

	@Override
	public void deleteAllCustomers() {
		customerRepository.deleteAll();
	}

	@Override
	public void deleteCustomerById(long id) {
		Customer customer = customerRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer does'nt exist with id: " + id));
		customerRepository.delete(customer);
	}
}
