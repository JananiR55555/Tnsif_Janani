package com.tns.fooddeliverysystem.entities;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private int id;
    private String name;
    private List<FoodItem> menu = new ArrayList<>();
    public Restaurant(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public List<FoodItem> getMenu() { return menu; }
    public void addFoodItem(FoodItem item) { menu.add(item); }
    public void removeFoodItem(int foodItemId) {
        menu.removeIf(item -> item.getId() == foodItemId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Restaurant ID " + id + ", Name " + name);
        for (FoodItem item: menu)
            sb.append(" - ").append(item.toString());
        return sb.toString();
    }
}
