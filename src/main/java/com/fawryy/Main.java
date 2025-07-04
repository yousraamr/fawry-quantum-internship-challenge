package com.fawryy;

import com.fawry.model.*;
import com.fawry.service.CheckoutService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Yousra", 500); 

        Product cheese = new ShippablePerishableProduct("Cheese", 100, 5, LocalDate.now().plusDays(1), 0.2);     
        Product biscuits = new ShippablePerishableProduct("Biscuits", 150, 2, LocalDate.now().plusDays(1), 0.7); 

        customer.addToCart(cheese, 2);     
        customer.addToCart(biscuits, 1);   

        CheckoutService.checkout(customer);
    }
}
