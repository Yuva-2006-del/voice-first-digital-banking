package com.voicefintech.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {

    public List<String> getHistory() {

        List<String> history = new ArrayList<>();

        history.add("17 Jan: Saved 300 rupees");
        history.add("17 Jan: Loan credited 50000 rupees");
        history.add("16 Jan: Sent 500 rupees");
        history.add("16 Jan: Gold investment 1000 rupees");
        history.add("15 Jan: Salary credited 25000 rupees");

        return history;
    }
}
