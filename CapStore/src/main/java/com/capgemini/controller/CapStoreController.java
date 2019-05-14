package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.model.Discount;
import com.capgemini.model.PromoCode;
import com.capgemini.service.DiscountService;
import com.capgemini.service.PromoCodeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/capstore")
public class CapStoreController
{
	@Autowired
	DiscountService discountService;
	
	@Autowired
	PromoCodeService promoCodeService;
	
	@PostMapping(value="/addDiscount/{id}",consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addDeposit(@PathVariable("id") int productId,@RequestBody Discount discount)
	{
		if(discountService.addDiscount(productId,discount)!=null)
		{
			return true;
		}
		return false;
	}
	
	@PostMapping(value="/addPromo",consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addPromoCode(@RequestBody PromoCode promoCode)
	{
		if(promoCodeService.addPromoCode(promoCode)!=null)
		{
			return true;
		}
		return false;
	}
}
