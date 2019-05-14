package com.capgemini.model;

import java.sql.Date;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_details")
public class OrderDetails 
{
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="order_details_id")
	  int id;
	  @Column(name="order_details_start_time")
	  Date startTime;
		
	  @Column(name="order_details_end_time")
	  Date endTime;
		
	  @Column(name="order_details_status")
	  String status;
	  
	  @Column(name="order_details_amount")
	  float amount;
	  
	  @Column(name="order_details_quantity")
	  int quantity;
	  
	  @OneToOne()
	  @JoinColumn(name="customer_id")
	  Customer customer;
	  
	  //@OneToMany(cascade=CascadeType.ALL)
	  //@JoinColumn(name="product_id")
	  //List<Product> productList;
	  

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/*public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}*/

	public OrderDetails(int id, Date startTime, Date endTime, String status, float amount, int quantity,
			Customer customer /*,List<Product> productList*/) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
		this.amount = amount;
		this.quantity = quantity;
		this.customer = customer;
		//this.productList = productList;
	}

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", status=" + status
				+ ", amount=" + amount + ", quantity=" + quantity + ", customer=" + customer + ", productList=" 
				+ "]";
	}
	  
	  
}
