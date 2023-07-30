package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class HeathCheckController {
    @PostMapping
    public ResponseEntity healthCheck() {
        return ResponseEntity.ok("OK");
    }
}
