package com.capgemini.model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="promo_code")
public class PromoCode 
{
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="promocode_id")
	  int id;
	 
	  @Column(name="promocode_start_time")
	  Date startTime;
		
	  @Column(name="promocode_end_time")
	  Date endTime;
		
	  @Column(name="promocode_name")
	  String name;
	  
	  @Column(name="promocode_description")
	  String description;

	  @Column(name="promocode_discount_amount")
	  float discountAmount;
	  
	  @Column(name="promocode_minimum_amount")
	  int minimumAmount;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(float discountAmount) {
		this.discountAmount = discountAmount;
	}

	public int getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(int minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	public PromoCode(int id, Date startTime, Date endTime, String name, String description, float discountAmount,
			int minimumAmount) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.name = name;
		this.description = description;
		this.discountAmount = discountAmount;
		this.minimumAmount = minimumAmount;
	}

	public PromoCode() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PromoCode [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", name=" + name
				+ ", description=" + description + ", discountAmount=" + discountAmount + ", minimumAmount="
				+ minimumAmount + "]";
	}

	

	


	  
}
