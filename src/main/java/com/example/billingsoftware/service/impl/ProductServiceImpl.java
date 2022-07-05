package com.example.billingsoftware.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.billingsoftware.entity.Product;
import com.example.billingsoftware.exception.ResourceNotFoundException;
import com.example.billingsoftware.repository.ProductRepository;
import com.example.billingsoftware.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(long id) throws ResourceNotFoundException {
		return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product does'nt exist with id: " + id));
	}

	@Override
	public void deleteAllProducts() {
		productRepository.deleteAll();
	}

	@Override
	public void deleteProductById(long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product updateProduct(long id, Product updatedProduct) {
		Product oldProduct = getProductById(id);
		oldProduct.setP_name(updatedProduct.getP_name());
		oldProduct.setP_rate(updatedProduct.getP_rate());
		return oldProduct;
	}

}
