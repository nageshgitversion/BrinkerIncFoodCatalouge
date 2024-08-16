package com.BrinkerInc.BrinkerIncFoodCatalouge.dto;

import java.util.List;

import com.BrinkerInc.BrinkerIncFoodCatalouge.entity.FoodItem;

public class FoodCatalougePageDto {
	
	private List<FoodItem> foodItems;
	public List<FoodItem> getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(List<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	private Restaurant restaurant;

}
