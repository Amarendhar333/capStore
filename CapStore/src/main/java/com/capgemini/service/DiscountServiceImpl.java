package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.model.Discount;
import com.capgemini.repository.DiscountRepository;

@Service
public class DiscountServiceImpl implements DiscountService
{
	@Autowired
	DiscountRepository discountRepository;
	
	public DiscountServiceImpl() { }

	@Transactional
	@Override
	public Discount addDiscount( Discount discount) 
	{
		//discount.setProductId(productId);
		return discountRepository.save(discount);
	}

	@Override
	public void removeDiscount(Discount discount) 
	{
		discountRepository.delete(discount);
	}

	@Override
	public void updateDiscount(Discount discount) 
	{
		discountRepository.save(discount);
	}
}
