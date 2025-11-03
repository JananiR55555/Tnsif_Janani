package com.tns.fooddeliverysystem.entities;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<FoodItem, Integer> items = new HashMap<>();
    public void addItem(FoodItem item, int quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }
    public void removeItem(FoodItem item) {
        items.remove(item);
    }
    public Map<FoodItem, Integer> getItems() { return items; }
    @Override
    public String toString() {
        if (items.isEmpty()) return "Cart is empty.";
        StringBuilder sb = new StringBuilder();
        double total = 0;
        for (Map.Entry<FoodItem, Integer> entry : items.entrySet()) {
            double cost = entry.getKey().getPrice() * entry.getValue();
            sb.append(entry.getKey().getName()).append(", Quantity ").append(entry.getValue())
              .append(", Cost Rs. ").append(cost).append("\n");
            total += cost;
        }
        sb.append("Total Cost Rs. ").append(total);
        return sb.toString();
    }
}
