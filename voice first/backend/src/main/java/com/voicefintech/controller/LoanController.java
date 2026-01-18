package com.voicefintech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loan")
@CrossOrigin(origins = "*")
public class LoanController {

    private String loanStatus = "No active loan";

    // Apply for loan
    @PostMapping("/apply")
    public String applyLoan(
            @RequestParam int amount,
            @RequestParam int tenure
    ) {
        loanStatus = "Loan of " + amount + " approved for " + tenure + " months";
        return loanStatus;
    }

    // Check loan status
    @GetMapping("/status")
    public String getLoanStatus() {
        return loanStatus;
    }
}
