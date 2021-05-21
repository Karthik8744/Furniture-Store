package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Cart;
import com.example.models.User;
import com.example.repository.UserRepository;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@GetMapping("/greet")
	public String greet(){
		return "HEY";
	}
	
	@GetMapping("/getUsers")
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userRepository.save(user);
		
		return "User added";
	}

}
