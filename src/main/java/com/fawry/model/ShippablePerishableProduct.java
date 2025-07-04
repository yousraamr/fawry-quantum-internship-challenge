package com.fawry.model;

import java.time.LocalDate;

public class ShippablePerishableProduct extends PerishableProduct implements Shippable {
    private double weight; // in kg

    public ShippablePerishableProduct(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        super(name, price, quantity, expiryDate);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
