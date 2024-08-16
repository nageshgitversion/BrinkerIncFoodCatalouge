package com.BrinkerInc.BrinkerIncFoodCatalouge.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BrinkerInc.BrinkerIncFoodCatalouge.entity.FoodItem;


@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Serializable>{
	
	
	public List<FoodItem> findByRestaurantId(Integer restaurantId);

}
