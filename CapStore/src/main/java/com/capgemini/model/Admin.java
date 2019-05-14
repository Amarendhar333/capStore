package com.capgemini.model;

import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_table")
public class Admin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="admin_id")
	int id;
	@Column(name="admin_start_time")
	Date startTime;
	@Column(name="admin_end_time")
	Date endTime;
	@Column(name="admin_password")
	String password;
    @Column(name="admin_name")
	String name;
    @Column(name="admin_email")
	String email;
	@Column(name="admin_phone")
	String phone;
	@Column(name="total_revenue")
	private double totalRevenue;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(int id, Date startTime, Date endTime, String password, String name, String email, String phone,
			double totalRevenue) {
		super();
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.totalRevenue = totalRevenue;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}

	
	  
		
	 
}
