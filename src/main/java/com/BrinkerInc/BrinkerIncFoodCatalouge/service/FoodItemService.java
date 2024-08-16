package com.BrinkerInc.BrinkerIncFoodCatalouge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.BrinkerInc.BrinkerIncFoodCatalouge.dto.FoodCatalougePageDto;
import com.BrinkerInc.BrinkerIncFoodCatalouge.dto.FoodItemDto;
import com.BrinkerInc.BrinkerIncFoodCatalouge.dto.Restaurant;
import com.BrinkerInc.BrinkerIncFoodCatalouge.entity.FoodItem;
import com.BrinkerInc.BrinkerIncFoodCatalouge.mapper.FoodItemMapper;
import com.BrinkerInc.BrinkerIncFoodCatalouge.repository.FoodItemRepository;

@Service
public class FoodItemService {
	
	@Autowired
	private FoodItemRepository repo;
	
	@Autowired
	private RestTemplate template;
	
	
	public FoodItemDto addFoodItem(FoodItemDto dto) {
		
		FoodItem item = repo.save(FoodItemMapper.INSTANCE.FoodItemDtoToFoodItem(dto));
		
		return FoodItemMapper.INSTANCE.FoodItemToFoodItemDto(item);
	}
	
	
	
	public FoodCatalougePageDto fecthFoodCatalougePage(Integer restaurantId) {
		
		List<FoodItem> foodItemsByRestaurantId = findFoodItemsByRestaurantId(restaurantId);
		Restaurant restaurantById = getRestaurantById(restaurantId);
		
		return createFoodCatalougePage(foodItemsByRestaurantId,restaurantById);
		
	}
	
	
	private FoodCatalougePageDto createFoodCatalougePage(List<FoodItem> items,Restaurant restaurant) {
		
		FoodCatalougePageDto dto = new FoodCatalougePageDto();
		
		dto.setFoodItems(items);
		dto.setRestaurant(restaurant);
		
		return dto;
		
	}
	
	
	
	private List<FoodItem> findFoodItemsByRestaurantId(Integer restaurantId){
		
		List<FoodItem> itemsByRestaurantId = repo.findByRestaurantId(restaurantId);
		
		return itemsByRestaurantId;
	}
	
	
	private Restaurant getRestaurantById(Integer restaurantId) {
		
		
		
		Restaurant forObject = template.getForObject("http://BRINKERLIST/restaurant/getbyid/"+restaurantId, Restaurant.class);
		
		return forObject;
	}

}
