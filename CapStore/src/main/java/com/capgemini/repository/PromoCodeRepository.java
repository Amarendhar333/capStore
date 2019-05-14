package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.PromoCode;

@Repository
public interface PromoCodeRepository extends CrudRepository<PromoCode,Integer>
{
	
}
