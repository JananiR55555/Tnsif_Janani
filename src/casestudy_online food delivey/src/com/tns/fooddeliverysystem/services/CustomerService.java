package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.*;

import java.util.Map;

public class CustomerService {
    public void addToCart(Customer customer, FoodItem item, int quantity) {
        customer.getCart().addItem(item, quantity);
    }
    public void removeFromCart(Customer customer, FoodItem item) {
        customer.getCart().removeItem(item);
    }
    public Map<FoodItem, Integer> getCartItems(Customer customer) {
        return customer.getCart().getItems();
    }
}