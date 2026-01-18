package com.voicefintech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/assistant")
@CrossOrigin
public class AssistantController {

    @GetMapping("/status")
    public String getAssistantStatus() {
        return "Assistant is active and listening";
    }
}
