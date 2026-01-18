
package com.voicefintech.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StatementService {

    public List<Map<String, String>> getMiniStatement() {

        List<Map<String, String>> list = new ArrayList<>();

        list.add(create("17-01-2026", "Savings Deposit", "-300"));
        list.add(create("17-01-2026", "Loan Credit", "+50000"));
        list.add(create("16-01-2026", "UPI Transfer", "-500"));
        list.add(create("16-01-2026", "Gold Investment", "-1000"));
        list.add(create("15-01-2026", "Salary Credit", "+25000"));

        return list;
    }

    private Map<String, String> create(String date, String desc, String amt) {
        Map<String, String> map = new HashMap<>();
        map.put("date", date);
        map.put("description", desc);
        map.put("amount", amt);
        return map;
    }
}
