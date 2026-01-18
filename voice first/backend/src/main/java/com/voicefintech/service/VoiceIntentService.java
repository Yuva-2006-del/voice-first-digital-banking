
package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class VoiceIntentService {

    public String detectIntent(String spokenText) {

        if (spokenText == null) {
            return "UNKNOWN";
        }

        spokenText = spokenText.toLowerCase();

        if (spokenText.contains("balance")) {
            return "CHECK_BALANCE";
        }

        if (spokenText.contains("save")) {
            return "SAVE_MONEY";
        }

        if (spokenText.contains("loan")) {
            return "LOAN_REQUEST";
        }

        if (spokenText.contains("statement")) {
            return "MINI_STATEMENT";
        }

        if (spokenText.contains("donate")) {
            return "DONATION";
        }

        return "UNKNOWN";
    }
}
