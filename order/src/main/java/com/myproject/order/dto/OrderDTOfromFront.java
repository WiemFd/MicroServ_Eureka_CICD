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
}
