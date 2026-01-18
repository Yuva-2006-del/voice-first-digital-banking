package com.voicefintech.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/statement")
@CrossOrigin(origins = "*")
public class StatementController {

    // Mini statement (last 5 transactions - demo)
    @GetMapping("/mini")
    public List<Map<String, String>> getMiniStatement() {

        List<Map<String, String>> statement = new ArrayList<>();

        statement.add(Map.of(
                "date", "17-01-2026",
                "description", "Savings Deposit",
                "amount", "-300"
        ));

        statement.add(Map.of(
                "date", "17-01-2026",
                "description", "Loan Credit",
                "amount", "+50000"
        ));

        statement.add(Map.of(
                "date", "16-01-2026",
                "description", "UPI Transfer",
                "amount", "-500"
        ));

        statement.add(Map.of(
                "date", "16-01-2026",
                "description", "Gold Investment",
                "amount", "-1000"
        ));

        statement.add(Map.of(
                "date", "15-01-2026",
                "description", "Salary Credit",
                "amount", "+25000"
        ));

        return statement;
    }
}

