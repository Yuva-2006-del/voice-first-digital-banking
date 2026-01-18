
package com.voicefintech.service;

import org.springframework.stereotype.Service;

@Service
public class FaceAuthService {

    // Demo face verification
    public boolean verifyFace(byte[] faceData) {
        // In real system → ML model comparison
        // For hackathon → always true
        return true;
    }

    public boolean isFaceRegistered(Long userId) {
        return true;
    }
}
