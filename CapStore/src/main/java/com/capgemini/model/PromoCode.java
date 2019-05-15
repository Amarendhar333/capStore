package com.capgemini.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="promo_code")
public class PromoCode 
{
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="promocode_id")
	  int id;
	 
	  @Column(name="promocode_start_time")
	  @Temporal(TemporalType.DATE)
	  Date promoStartTime;
		
	  @Column(name="promocode_end_time")
	  @Temporal(TemporalType.DATE)
	  Date promoEndTime;
		
	  @Column(name="promocode_name",length=50)
	  String promoName;
	  
	  @Column(name="promocode_description",length=50)
	  String promoDescription;

	  @Column(name="promocode_discount_amount")
	  float promoDiscountAmount;
	  
	  @Column(name="promocode_minimum_amount")
	  int promoMinimumAmount;

	public PromoCode(Date promoStartTime, Date promoEndTime, String promoName, String promoDescription,
			float promoDiscountAmount, int promoMinimumAmount) {
		super();
		this.promoStartTime = promoStartTime;
		this.promoEndTime = promoEndTime;
		this.promoName = promoName;
		this.promoDescription = promoDescription;
		this.promoDiscountAmount = promoDiscountAmount;
		this.promoMinimumAmount = promoMinimumAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPromoStartTime() {
		return promoStartTime;
	}

	public void setPromoStartTime(Date promoStartTime) {
		this.promoStartTime = promoStartTime;
	}

	public Date getPromoEndTime() {
		return promoEndTime;
	}

	public void setPromoEndTime(Date promoEndTime) {
		this.promoEndTime = promoEndTime;
	}

	public String getPromoName() {
		return promoName;
	}

	public void setPromoName(String promoName) {
		this.promoName = promoName;
	}

	public String getPromoDescription() {
		return promoDescription;
	}

	public void setPromoDescription(String promoDescription) {
		this.promoDescription = promoDescription;
	}

	public float getPromoDiscountAmount() {
		return promoDiscountAmount;
	}

	public void setPromoDiscountAmount(float promoDiscountAmount) {
		this.promoDiscountAmount = promoDiscountAmount;
	}

	public int getPromoMinimumAmount() {
		return promoMinimumAmount;
	}

	public void setPromoMinimumAmount(int promoMinimumAmount) {
		this.promoMinimumAmount = promoMinimumAmount;
	}

	@Override
	public String toString() {
		return "PromoCode [promoStartTime=" + promoStartTime + ", promoEndTime=" + promoEndTime + ", promoName="
				+ promoName + ", promoDescription=" + promoDescription + ", promoDiscountAmount=" + promoDiscountAmount
				+ ", promoMinimumAmount=" + promoMinimumAmount + "]";
	}

 
}
