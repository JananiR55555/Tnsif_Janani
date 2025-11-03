package com.tns.fooddeliverysystem.services;

import com.tns.fooddeliverysystem.entities.*;

import java.util.Map;

public class OrderService {
    public Order placeOrder(int orderId, Customer customer, Map<FoodItem, Integer> items, String address) {
        return new Order(orderId, customer, items, address);
    }
    public void assignDeliveryPerson(Order order, DeliveryPerson dp) {
        order.setDeliveryPerson(dp);
    }
    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
    }
}