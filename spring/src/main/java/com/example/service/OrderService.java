package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Order;
import com.example.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	
	//GET ALL ORDERS
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}
	
	

}
