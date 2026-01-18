
package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class SavingsService {

    private double savings = 0;

    public String addSavings(double amount) {
        if (amount <= 0) {
            return "Invalid amount";
        }

        savings += amount;
        return "Saved " + amount + " rupees successfully";
    }

    public String withdrawSavings(double amount) {
        if (amount > savings) {
            return "Insufficient savings balance";
        }

        savings -= amount;
        return "Withdrawn " + amount + " rupees from savings";
    }

    public double getSavingsBalance() {
        return savings;
    }
}
