package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Order;
import com.example.service.OrderService;

@RestController
public class OrderController {
	
	
	@Autowired
	private OrderService orderService;
	
	//GET ALL ORDERS
	@GetMapping("/admin/orders")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}
	
	
}
