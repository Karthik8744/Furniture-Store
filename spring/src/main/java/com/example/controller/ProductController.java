package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Product;
import com.example.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAllProducts")
	public List<Product> getProduct() {
		return productService.getProduct();
	}
	
	@PostMapping("/admin/addProduct")
	public void addProduct(@RequestBody Product product) {
		 productService.addProduct(product);
	}
	
	@GetMapping("/getProductById")
	public Optional<Product> getproductById(@RequestBody Long id){
		return productService.findById(id);
	}
		
	
	
}
