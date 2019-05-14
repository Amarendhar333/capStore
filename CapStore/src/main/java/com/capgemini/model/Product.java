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
  
  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "merchant_product", joinColumns = { @JoinColumn(name = "product_id") }, inverseJoinColumns = { @JoinColumn(name = "merchant_id") })
  List<Merchant> merchantList;
  
  //@OneToOne(mappedBy="product")
  //Discount discount;
  
  @OneToOne()
  @JoinColumn(name="category_id")
  Category category;
  
  @OneToMany(cascade=CascadeType.ALL)
  @JoinColumn(name="feedback_id")
  List<FeedBack> feedback;
  
  //@ManyToOne(fetch=FetchType.LAZY)
  //Cart cart;
  
  //@ManyToOne(fetch=FetchType.LAZY)
  //OrderDetails orderDetails;
  
  //@ManyToOne(fetch=FetchType.LAZY)
  //WishList wishlist;
  
  public Product(Date startTime, Date endTime, String name, String description, float cost, String status,
			int quantity, MultipartFile productImage, int viewCount, Category category) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.status = status;
		this.quantity = quantity;
		this.productImage = productImage;
		this.viewCount = viewCount;
		this.category = category;
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

/*public Discount getDiscount() {
	return discount;
}

public void setDiscount(Discount discount) {
	this.discount = discount;
}*/

public Category getCategory() {
	return category;
}

public void setCategory(Category category) {
	this.category = category;
}


public MultipartFile getProductImage() {
	return productImage;
}

public void setProductImage(MultipartFile productImage) {
	this.productImage = productImage;
}

public List<FeedBack> getFeedback() {
	return feedback;
}

public void setFeedback(List<FeedBack> feedback) {
	this.feedback = feedback;
}

public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public List<Merchant> getMerchantList() {
	return merchantList;
}

public void setMerchantList(List<Merchant> merchantList) {
	this.merchantList = merchantList;
}

public Product(int id, Date startTime, Date endTime, String name, String description, float cost, String status,
		int quantity, MultipartFile productImage, int viewCount, List<Merchant> merchantList,
		Category category, List<FeedBack> feedback) {
	super();
	this.id = id;
	this.startTime = startTime;
	this.endTime = endTime;
	this.name = name;
	this.description = description;
	this.cost = cost;
	this.status = status;
	this.quantity = quantity;
	this.productImage = productImage;
	this.viewCount = viewCount;
	this.merchantList = merchantList;
	this.category = category;
	this.feedback = feedback;
}

@Override
public String toString() {
	return "Product [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", name=" + name
			+ ", description=" + description + ", cost=" + cost + ", status=" + status + ", quantity=" + quantity
			+ ", productImage=" + productImage + ", viewCount=" + viewCount + ", merchantList=" + merchantList
			+ ", category=" + category + ", feedback=" + feedback + "]";
}

  
}