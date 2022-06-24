package com.example.billingsoftware.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.billingsoftware.entity.Product;
import com.example.billingsoftware.exception.ResourceNotFoundException;

@Component
public interface ProductService {
	List<Product> getAllProducts();
 	
	Product createProduct(Product product);
 	
	Product getProductById(long id) throws ResourceNotFoundException;
 	
 	void deleteAllProducts();
 	
 	void deleteProductById(long id);

 	Product updateProduct(long id, Product updatedProduct);	
}
