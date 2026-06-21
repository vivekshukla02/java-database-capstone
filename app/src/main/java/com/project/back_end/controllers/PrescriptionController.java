package com.project.back_end.controllers;

import com.project.back_end.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity<?> savePrescription(
            @RequestHeader("Authorization") String token,
            @RequestBody Map<String, String> body) {
        
        if (token == null || !tokenService.validateToken(token.replace("Bearer ", ""))) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error", "Unauthorized access token"));
        }

        if (!body.containsKey("diagnosis") || !body.containsKey("medicines")) {
            return ResponseEntity.badRequest().body(Map.of("status", "error", "message", "Missing validation data"));
        }

        return ResponseEntity.ok(Map.of("status", "success", "message", "Prescription saved successfully"));
    }
}
