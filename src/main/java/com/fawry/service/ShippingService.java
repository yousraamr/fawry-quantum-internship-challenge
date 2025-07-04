package com.fawry.service;

import com.fawry.model.Shippable;

import java.util.List;

public class ShippingService {
    public static void processShipment(List<Shippable> items) {
        double totalWeight = 0;
        System.out.println("** Shipment notice **");

        // Count same items
        for (Shippable item : items) {
            System.out.printf("1x %s        %.0fg\n", item.getName(), item.getWeight() * 1000); // in grams
            totalWeight += item.getWeight();
        }

        System.out.printf("Total package weight %.1fkg\n\n", totalWeight);
    }
}
