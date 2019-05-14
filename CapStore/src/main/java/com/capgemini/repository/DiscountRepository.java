package com.capgemini.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.model.Discount;

@Repository
public interface DiscountRepository extends CrudRepository<Discount,Integer>
{
	
}
