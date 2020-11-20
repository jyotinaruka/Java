package com.dojo.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dojo.spring.model.Product;
import com.dojo.spring.repositories.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		
		this.productRepository = productRepository;
	}

	public void save(Product product) {
		this.productRepository.save(product);
		
	}

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
}
