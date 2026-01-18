package com.voicefintech.security;

import org.springframework.stereotype.Component;

@Component
public class FraudDetection {

    public boolean isTransactionSuspicious(double amount) {

        // Simple demo rule
        if (amount > 100000) {
            return true;
        }

        return false;
    }

    public String getAlertMessage() {
        return "Transaction flagged for verification";
    }
}
