package com.myproject.restaurantlisting.service;

import com.myproject.restaurantlisting.dto.RestaurantDTO;
import com.myproject.restaurantlisting.entity.Restaurant;
import com.myproject.restaurantlisting.mapper.RestaurantMapper;
import com.myproject.restaurantlisting.repo.RestaurantRepo;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class RestaurantService {

    @Autowired

    RestaurantRepo restaurantRepo;

    public List<RestaurantDTO> findAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepo.findAll();
        List<RestaurantDTO> restaurantDTOList = restaurants.stream().map(restaurant -> RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
        return restaurantDTOList;
    }
}