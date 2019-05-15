package com.capgemini.controller;

import java.util.Date;

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
	
	@PostMapping(value="/addDiscount",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addDeposit(@RequestBody Discount discount)
	{
		System.out.println(discount.getDiscountStartTime());
		discountService.addDiscount(discount);
	}
	
	@PostMapping(value="/addPromo",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addPromoCode(@RequestBody PromoCode promoCode)
	{
		System.out.println(promoCode);
		//System.out.println(discountAmount);
		//System.out.println(startDate);
		//promoCode.setStartTime(startDate);
		//promoCode.setDiscountAmount(discountAmount);
		promoCodeService.addPromoCode(promoCode);
	}
}
