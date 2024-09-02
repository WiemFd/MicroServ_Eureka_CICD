package com.myproject.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTOfromFront {
    private List<FoodItemsDTO> foodItemsList;
    private Integer userId;
    private Restaurant restaurant;

    // Getter for foodItemsList
    public List<FoodItemsDTO> getFoodItemList() {
        return foodItemsList;
    }

    // Getter for userId
    public Integer getUserId() {
        return userId;
    }

    // Getter for restaurant
    public Restaurant getRestaurant() {
        return restaurant;
    }
}
