package com.capgemini.model;

import java.sql.Date;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class FeedBack
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="feedback_id")
	int id;
	
	@Column(name="feedback_start_time")
	Date startTime;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="customer_id")
	Customer customer;
	
	@Column(name="feedback_comment")
	String comment;
	
	@Column(name="feedback_rating")
	int rating;
	
	//@ManyToOne(fetch=FetchType.LAZY)
	//Product product;

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


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public FeedBack(int id, Date startTime,  Customer customer, String comment, int rating) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.customer = customer;
		this.comment = comment;
		this.rating = rating;
	}

	public FeedBack() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
