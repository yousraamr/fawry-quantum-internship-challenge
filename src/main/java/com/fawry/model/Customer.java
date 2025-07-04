package com.fawry.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private double balance;
    private List<CartItem> cart = new ArrayList<>();

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean addToCart(Product product, int quantity) {
        if (product.isExpired()) {
            System.out.println("Error: Product " + product.getName() + " is expired.");
            return false;
        }
        if (!product.isAvailable(quantity)) {
            System.out.println("Error: Not enough stock for " + product.getName());
            return false;
        }
        cart.add(new CartItem(product, quantity));
        return true;
    }

    public List<CartItem> getCart() { return cart; }
    public double getBalance() { return balance; }
    public void deductBalance(double amount) { balance -= amount; }
}
