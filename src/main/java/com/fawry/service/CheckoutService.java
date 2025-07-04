package com.fawry.service;

import com.fawry.model.*;

import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    public static void checkout(Customer customer) {
        List<CartItem> cart = customer.getCart();
        if (cart.isEmpty()) {
            System.out.println("Error: Cart is empty.");
            return;
        }

        double subtotal = 0;
        double shippingFee = 0;
        List<Shippable> shippables = new ArrayList<>();

        for (CartItem item : cart) {
            Product product = item.getProduct();
            int qty = item.getQuantity();

            if (product.isExpired() || !product.isAvailable(qty)) {
                System.out.println("Error: " + product.getName() + " is unavailable or expired.");
                return;
            }

            subtotal += product.getPrice() * qty;
            if (product instanceof Shippable shippable) {
                for (int i = 0; i < qty; i++) {
                    shippables.add(shippable);
                    shippingFee += 10;
                }
            }
        }

        double total = subtotal + shippingFee;

        if (customer.getBalance() < total) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        customer.deductBalance(total);
        cart.forEach(item -> item.getProduct().decreaseQuantity(item.getQuantity()));

        if (!shippables.isEmpty()) {
            ShippingService.processShipment(shippables);
        }

        System.out.println("\n** Checkout receipt **");
        for (CartItem item : cart) {
            System.out.printf("%dx %s %.0f\n", item.getQuantity(), item.getProduct().getName(), item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.printf("Subtotal         %.0f\n", subtotal);
        System.out.printf("Shipping         %.0f\n", shippingFee);
        System.out.printf("Amount           %.0f\n", total);
        System.out.printf("Balance Left     %.0f\n", customer.getBalance());
    }
}
