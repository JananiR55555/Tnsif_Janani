package com.tns.fooddeliverysystem.entities;

public class FoodItem {
    private int id;
    private String name;
    private double price;
    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    @Override
    public String toString() {
        return "Food Item ID " + id + ", Name " + name + ", Price Rs. " + price;
    }
}
