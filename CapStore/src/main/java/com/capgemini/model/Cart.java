package com.capgemini.model;

import java.sql.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cart_id")
	int id;
	@Column(name="cart_start_time")
	Date startTime;
	@Column(name="cart_end_time")
	Date endTime;
	@OneToMany
	@JoinColumn(name="product_id")
	List<Product> productList;
	@Column(name="cart_quantity")
	int quantity;
	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	@JoinColumn(name="cart_item_id")
    private List<CartItem> cartItems;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	Customer customer;


	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cart(int id, Date startTime, Date endTime, List<Product> productList, int quantity,
			List<CartItem> cartItems) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.productList = productList;
		this.quantity = quantity;
		this.cartItems = cartItems;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getStartTime() {
		return startTime;
	}


	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}


	public Date getEndTime() {
		return endTime;
	}


	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}


	public List<Product> getProductList() {
		return productList;
	}


	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public List<CartItem> getCartItems() {
		return cartItems;
	}


	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	
	
	
	

	
	
}
