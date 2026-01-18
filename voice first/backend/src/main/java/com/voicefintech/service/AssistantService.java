
package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class AssistantService {

    public String getGreeting(String language) {
        if (language == null) {
            return "Welcome. How can I help you?";
        }

        switch (language.toLowerCase()) {
            case "ta":
                return "வணக்கம். நான் உங்களுக்கு எப்படி உதவலாம்?";
            case "hi":
                return "नमस्ते। मैं आपकी कैसे मदद कर सकता हूँ?";
            case "en":
            default:
                return "Welcome. How can I help you?";
        }
    }

    public boolean isAssistantActive() {
        return true;
    }
}
