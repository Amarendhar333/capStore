package com.capgemini.service;

import com.capgemini.model.Discount;

public interface DiscountService
{
	public Discount addDiscount(Discount discount);
	public void removeDiscount(Discount discount);
	public void updateDiscount(Discount discount);
}
