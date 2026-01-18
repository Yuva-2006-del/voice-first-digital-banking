package com.voicefintech.security;

import org.springframework.stereotype.Component;

@Component
public class VoiceConfirmation {

    public boolean confirmAction(String spokenText) {

        if (spokenText == null) {
            return false;
        }

        spokenText = spokenText.toLowerCase();

        return spokenText.contains("yes")
                || spokenText.contains("confirm")
                || spokenText.contains("okay");
    }
}
