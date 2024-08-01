package com.myproject.foodcatalogue.dto;


import com.myproject.foodcatalogue.entity.FoodItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class FoodCataloguePage {

    private List<FoodItem> foodItemList;
    private Restaurant restaurant;


        // Getters and setters
        public List<FoodItem> getFoodItemList() {
            return foodItemList;
        }

        public void setFoodItemList(List<FoodItem> foodItemList) {
            this.foodItemList = foodItemList;
        }

        public Restaurant getRestaurant() {
            return restaurant;
        }

        public void setRestaurant(Restaurant restaurant) {
            this.restaurant = restaurant;
        }



}


