package com.tns.fooddeliverysystem.entities;

import java.util.Map;

public class Order {
    private int orderId;
    private Customer customer;
    private Map<FoodItem, Integer> items;
    private String status = "Pending";
    private DeliveryPerson deliveryPerson;
    private String deliveryAddress;
    public Order(int orderId, Customer customer, Map<FoodItem, Integer> items, String deliveryAddress) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.deliveryAddress = deliveryAddress;
    }
    public int getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public Map<FoodItem, Integer> getItems() { return items; }
    public String getStatus() { return status; }
    public DeliveryPerson getDeliveryPerson() { return deliveryPerson; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public void setStatus(String status) { this.status = status; }
    public void setDeliveryPerson(DeliveryPerson p) { this.deliveryPerson = p; }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrderID " + orderId 
                + ", Customer: " + customer.getUsername() + ", Items: ");
        for (Map.Entry<FoodItem, Integer> entry : items.entrySet())
            sb.append(entry.getKey().getName()).append("x").append(entry.getValue()).append(", ");
        sb.append("Status: ").append(status);
        sb.append(", DeliveryPerson: ");
        sb.append(deliveryPerson == null ? "Not Assigned" : deliveryPerson.getName());
        return sb.toString();
    }
}
