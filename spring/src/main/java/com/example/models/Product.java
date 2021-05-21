package com.example.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String imageurl;
	
	private String productname;
	
	private String price;
	
	private String description;
	
	private Integer quantity;
	
	
	public Product(String imageurl, String productname, String price, String description, Integer quantity) {
		super();
		this.imageurl = imageurl;
		this.productname = productname;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}
	
	
	
	

	public Product() {
		super();
	}


	

	public Long getId() {
		return Id;
	}




	public void setId(Long id) {
		Id = id;
	}




	public String getImageurl() {
		return imageurl;
	}




	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}




	public String getProductname() {
		return productname;
	}




	public void setProductname(String productname) {
		this.productname = productname;
	}




	public String getPrice() {
		return price;
	}




	public void setPrice(String price) {
		this.price = price;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Integer getQuantity() {
		return quantity;
	}




	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}




	
	

}