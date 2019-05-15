package com.capgemini.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="discount")
public class Discount 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="discount_id")
	int id;
	
	@Column(name="discount_start_time")
	@Temporal(TemporalType.DATE)
	Date discountStartTime;
	
	@Column(name="discount_end_time")
	@Temporal(TemporalType.DATE)
	Date discountEndTime;
	
	@Column(name="product_id")
	int productId;
	
	@Column(name="discount_percentage")
	int discountPercentage;

	
	

	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Discount(Date discountStartTime, Date discountEndTime, int productId, int discountPercentage) {
		super();
		this.discountStartTime = discountStartTime;
		this.discountEndTime = discountEndTime;
		this.productId = productId;
		this.discountPercentage = discountPercentage;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public Date getDiscountStartTime() {
		return discountStartTime;
	}




	public void setDiscountStartTime(Date discountStartTime) {
		this.discountStartTime = discountStartTime;
	}




	public Date getDiscountEndTime() {
		return discountEndTime;
	}




	public void setDiscountEndTime(Date discountEndTime) {
		this.discountEndTime = discountEndTime;
	}




	public int getProductId() {
		return productId;
	}




	public void setProductId(int productId) {
		this.productId = productId;
	}




	public int getDiscountPercentage() {
		return discountPercentage;
	}




	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}




	@Override
	public String toString() {
		return "Discount [id=" + id + ", discountStartTime=" + discountStartTime + ", discountEndTime="
				+ discountEndTime + ", productId=" + productId + ", discountPercentage=" + discountPercentage + "]";
	}
	
	
}
