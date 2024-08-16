package com.BrinkerInc.BrinkerIncFoodCatalouge.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.BrinkerInc.BrinkerIncFoodCatalouge.dto.FoodItemDto;
import com.BrinkerInc.BrinkerIncFoodCatalouge.entity.FoodItem;

@Mapper
public interface FoodItemMapper {
	
	FoodItemMapper INSTANCE = Mappers.getMapper(FoodItemMapper.class);
	
	FoodItemDto FoodItemToFoodItemDto(FoodItem foodItem);
	
	FoodItem FoodItemDtoToFoodItem(FoodItemDto foodItemDto);

}
