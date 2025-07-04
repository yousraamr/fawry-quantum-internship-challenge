package com.fawry.model;

public class NonPerishableProduct extends Product {
    public NonPerishableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
