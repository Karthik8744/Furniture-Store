package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Cart;
import com.example.repository.CartRepository;
import com.example.service.CartService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	/*
	 * @GetMapping("/getCart") public List<Cart> getAll() { return
	 * cartRepository.findAll(); }
	 * 
	 * @PostMapping("/saveCart") public String saveCart(@RequestBody Cart cart) {
	 * cartRepository.save(cart);
	 * 
	 * return "saved in cart"; }
	 */
}
