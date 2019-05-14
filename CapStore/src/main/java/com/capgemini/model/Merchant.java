package com.capgemini.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="merchant")
public class Merchant 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="merchant_id")
	int id;
	
	@Column(name="merchant_start_time")
	Date startTime;

	@Column(name="merchant_end_time")
	Date endTime;

	@Column(name="merchant_name")
	String name;

	@Column(name="merchant_address")
	String address;

	@Column(name="merchant_phone")
	String phone;
	
	@Column(name="merchant_status")
	String status;

	@Column(name="merchant_email")
	String email;

	@Column(name="merchant_password")
	String password;

	@Column(name="merchant_security_question")
	String securityQuestion;

	@Column(name="merchant_security_answer")
	String securityAnswer;

	@Transient
	@Column(name="merchant_image")
	MultipartFile merchantImage;
	
	@ManyToMany(mappedBy = "merchantList")
	private List<Product> productList;
	
	@Column(name="merchant_rating")
	private int merchantRating;
	
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public MultipartFile getMerchantImage() {
		return merchantImage;
	}

	public void setMerchantImage(MultipartFile merchantImage) {
		this.merchantImage = merchantImage;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public int getMerchantRating() {
		return merchantRating;
	}

	public void setMerchantRating(int merchantRating) {
		this.merchantRating = merchantRating;
	}
	
	


	



	

}
