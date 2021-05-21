package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.models.Product;
import com.example.repository.ProductRepository;

@Service
public class ProductService {
	
	
	@Autowired
	ProductRepository productRepository;
	
	//GET ALL PRODUCTS
	public List<Product> getProduct() {
		return productRepository.findAll();
	}
	
	
	//ADD PRODUCT
	@PostMapping("/admin/addProduct")
	public Product addProduct(@RequestBody Product product) {
		
		return productRepository.save(product);
		
	}
	
	
	//FIND BY PRODUCT ID
	public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
	}
	
	
	//EDIT PRODUCT BY IDENTITY
	public void EditProduct(Long id,Product product) {
		productRepository.save(product);
	}
	
	//DELETE PRODUCT BY ID
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}
	
	
	

}
