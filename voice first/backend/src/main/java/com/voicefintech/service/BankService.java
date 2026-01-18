
package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    private double balance = 12000; // demo balance

    public double getBalance() {
        return balance;
    }

    public String sendMoney(double amount, String to) {
        if (amount <= 0) {
            return "Invalid amount";
        }

        if (amount > balance) {
            return "Insufficient balance";
        }

        balance -= amount;
        return "Sent " + amount + " rupees to " + to;
    }
}
