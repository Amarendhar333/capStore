package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.model.PromoCode;
import com.capgemini.repository.PromoCodeRepository;

@Service
public class PromoCodeServiceImpl implements PromoCodeService
{
	@Autowired
	PromoCodeRepository promoCodeRepository;
	
	@Transactional
	@Override
	public PromoCode addPromoCode(PromoCode promoCode) 
	{
		return promoCodeRepository.save(promoCode);
	}
	
}
