package com.BrinkerInc.BrinkerIncFoodCatalouge.dto;

import lombok.Data;

@Data
public class FoodItemDto {
	
	
	private Integer id;
	private String itemName;
	private String itemDescription;
	private boolean isVeg;
	private Integer price;
	private Integer restaurantId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

}
