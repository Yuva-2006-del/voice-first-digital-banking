
package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class DonationService {

    public String donate(double amount, String cause) {
        if (amount <= 0) {
            return "Invalid donation amount";
        }

        if (cause == null || cause.isEmpty()) {
            cause = "general cause";
        }

        return "Donated " + amount + " rupees to " + cause;
    }
}
