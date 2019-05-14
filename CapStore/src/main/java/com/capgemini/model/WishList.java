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
@Table(name="wishlist")
public class WishList 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="wishlist_id")
	int id;
	@Column(name="wishlist_start_time")
	Date startTime;
	@Column(name="wishlist_end_time")
	Date endTime;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="product_id")
	List<Product> product;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	Customer customer;

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

	
	public WishList(int id, Date startTime, Date endTime, List<Product> product) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.product = product;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public WishList() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "WishList [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", product=" + product
				+ "]";
	}

	
}
