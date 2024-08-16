package com.BrinkerInc.BrinkerIncFoodCatalouge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BrinkerInc.BrinkerIncFoodCatalouge.dto.FoodCatalougePageDto;
import com.BrinkerInc.BrinkerIncFoodCatalouge.dto.FoodItemDto;
import com.BrinkerInc.BrinkerIncFoodCatalouge.service.FoodItemService;

@RestController
@RequestMapping("/foodcatalouge")
public class FoodItemController {
	
	@Autowired
	private FoodItemService service;
	
	@PostMapping("addfooditem")
	public ResponseEntity<FoodItemDto> addFoodItem(@RequestBody FoodItemDto dto){
		
		FoodItemDto foodItem = service.addFoodItem(dto);
		
		return new ResponseEntity<>(foodItem,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getmenu/{restaurantId}")
	public ResponseEntity<FoodCatalougePageDto> getRestaurantMenuById(@PathVariable Integer restaurantId){
		
		
		FoodCatalougePageDto fecthFoodCatalougePage = service.fecthFoodCatalougePage(restaurantId);
		
		return new ResponseEntity<>(fecthFoodCatalougePage,HttpStatus.ACCEPTED);
	}
	

}
