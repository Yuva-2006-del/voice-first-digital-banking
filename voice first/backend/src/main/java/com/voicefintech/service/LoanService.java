
package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class LoanService {

    private String loanStatus = "No active loan";

    public String applyLoan(double amount, int tenureMonths) {
        if (amount <= 0 || tenureMonths <= 0) {
            return "Invalid loan request";
        }

        loanStatus = "Loan of " + amount + " rupees approved for " 
                   + tenureMonths + " months";
        return loanStatus;
    }

    public String getLoanStatus() {
        return loanStatus;
    }
}
