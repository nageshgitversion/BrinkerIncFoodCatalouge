package com.BrinkerInc.BrinkerIncFoodCatalouge.dto;

public class Restaurant {
	
	
	private Integer id;
	private String name;
	private String address;
	private String city;
	private String restaurantDescription;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRestaurantDescription() {
		return restaurantDescription;
	}
	public void setRestaurantDescription(String restaurantDescription) {
		this.restaurantDescription = restaurantDescription;
	}
	
	
	@Override
	public String toString() {
		return "RestaurantDto [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city
				+ ", restaurantDescription=" + restaurantDescription + "]";
	}
	

}
