package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.*;

public class FoodService {
    public void addFoodToRestaurant(Restaurant restaurant, FoodItem item) {
        restaurant.addFoodItem(item);
    }
    public void removeFoodFromRestaurant(Restaurant restaurant, int foodItemId) {
        restaurant.removeFoodItem(foodItemId);
    }
}
