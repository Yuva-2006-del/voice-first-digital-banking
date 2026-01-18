
package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class GoldService {

    private double goldInGrams = 0.0;

    // Buy gold (simple conversion: 1 gram = 6000 rupees for demo)
    public String buyGold(double amount) {
        if (amount <= 0) {
            return "Invalid amount";
        }

        double grams = amount / 6000;
        goldInGrams += grams;

        return "Purchased " + String.format("%.2f", grams) + " grams of gold";
    }

    public double getGoldHoldings() {
        return goldInGrams;
    }
}
