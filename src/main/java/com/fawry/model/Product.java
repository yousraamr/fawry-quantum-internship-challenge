package com.fawry.model;

public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public boolean isAvailable(int requestedQty) {
        return requestedQty <= quantity;
    }

    public abstract boolean isExpired();

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void decreaseQuantity(int qty) { quantity -= qty; }
}
