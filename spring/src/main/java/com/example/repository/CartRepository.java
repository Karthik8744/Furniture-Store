package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.models.Cart;
@Repository
public interface CartRepository extends JpaRepository<Cart,Long>{
	
}
