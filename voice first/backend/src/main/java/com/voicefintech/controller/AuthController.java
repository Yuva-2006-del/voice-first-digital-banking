package com.voicefintech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @PostMapping("/face/verify")
    public boolean verifyFace() {
        return true;
    }
}
