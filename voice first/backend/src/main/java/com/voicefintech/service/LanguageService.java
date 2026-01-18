package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    public String detectLanguage(String spokenText) {

        if (spokenText == null) {
            return "en";
        }

        // Very simple demo logic (can be replaced with ML later)
        if (spokenText.matches(".*[அ-ஹ].*")) {
            return "ta"; // Tamil
        }

        if (spokenText.matches(".*[क-ह].*")) {
            return "hi"; // Hindi
        }

        return "en"; // Default English
    }

    public String respond(String language, String message) {

        switch (language) {
            case "ta":
                return "பதிவு செய்யப்பட்டது: " + message;
            case "hi":
                return "सफल: " + message;
            default:
                return message;
        }
    }
}
