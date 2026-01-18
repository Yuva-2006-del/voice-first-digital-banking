
package com.voicefintech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/savings")
@CrossOrigin(origins = "*")
public class SavingsController {

    private int savingsAmount = 0; // demo memory storage

    // Save money
    @PostMapping("/add")
    public String addSavings(@RequestParam int amount) {
        savingsAmount += amount;
        return "Saved " + amount + " rupees. Total savings is " + savingsAmount;
    }

    // Withdraw from savings
    @PostMapping("/withdraw")
    public String withdrawSavings(@RequestParam int amount) {
        if (amount > savingsAmount) {
            return "Insufficient savings balance";
        }
        savingsAmount -= amount;
        return "Withdrawn " + amount + " rupees. Remaining savings is " + savingsAmount;
    }

    // Check savings balance
    @GetMapping("/balance")
    public int getSavingsBalance() {
        return savingsAmount;
    }
}
