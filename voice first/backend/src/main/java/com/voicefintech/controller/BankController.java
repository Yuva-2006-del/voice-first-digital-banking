package com.voicefintech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bank")
@CrossOrigin(origins = "*")
public class BankController {

    // Get account balance
    @GetMapping("/balance")
    public int getBalance() {
        return 12000; // demo value
    }

    // Send money (demo)
    @PostMapping("/send")
    public String sendMoney(@RequestBody Object request) {
        return "Transaction successful";
    }
}

