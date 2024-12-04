package com.dev.hackerrankproblems;

import java.util.HashMap;
import java.util.Map;

public class PriceCheck {

    public static int priceCheck(String[] products, String[] productPrices, String[] productSold, float[] soldPrice) {
        int errorCount = 0;
        Map<String, Float> priceMap = new HashMap<>();

        // Create a map of product names to their correct prices
        for (int i = 0; i < products.length; i++) {
            priceMap.put(products[i], Float.parseFloat(productPrices[i]));
        }

        // Iterate over the sold items and compare their prices to the correct prices
        for (int i = 0; i < productSold.length; i++) {
            float correctPrice = priceMap.get(productSold[i]);
            if (correctPrice != soldPrice[i]) {
                errorCount++;
            }
        }

        return errorCount;
    }

    public static void main(String[] args) {
        String[] products = {"eggs", "milk", "cheese"};
        String[] productPrices = {"2.89", "3.29", "5.79"};
        String[] productSold = {"eggs", "eggs", "cheese", "milk"};
        float[] soldPrice = {2.89f, 2.99f, 5.97f, 3.29f};

        int errors = priceCheck(products, productPrices, productSold, soldPrice);
        System.out.println("Number of errors: " + errors); // Output: 2
    }
}