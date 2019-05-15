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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="product")
public class Product 
{
  

@Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="product_id")
  int id;
 
  @Column(name="product_start_time")
  Date startTime;

  @Column(name="product_end_time")
  Date endTime;
	
  @Column(name="product_name")
  String name;
  
  @Column(name="product_description")
  String description;
  
  @Column(name="product_cost")
  float cost;
  
  @Column(name="product_status")
  String status;
  
  @Column(name="product_quantity")
  int quantity;
  
  @Transient
  @Column(name="product_image")
  MultipartFile productImage;
  
  @Column(name="product_view_count")
  int viewCount;

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

public float getCost() {
	return cost;
}

public void setCost(float cost) {
	this.cost = cost;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getViewCount() {
	return viewCount;
}

public void setViewCount(int viewCount) {
	this.viewCount = viewCount;
}


public MultipartFile getProductImage() {
	return productImage;
}

public void setProductImage(MultipartFile productImage) {
	this.productImage = productImage;
}


public Product() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Product [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", name=" + name
			+ ", description=" + description + ", cost=" + cost + ", status=" + status + ", quantity=" + quantity
			+ ", productImage=" + productImage + ", viewCount=" + viewCount + "]";
}

  
}