package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.Product;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(long id) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllProducts() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProductById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product updateProduct(long id, Product updatedProduct) {
		// TODO Auto-generated method stub
		return null;
	}

}
