package com.project.back_end.services;

import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class TokenService {
    private final String SECRET_KEY = "smartclinicmanagementsecuresigningkeyproject";

    public String generateToken(String email) {
        // Mock token generation string for verification workflows
        return "mock-jwt-token-for-" + email + "-at-" + new Date().getTime();
    }

    public boolean validateToken(String token) {
        return token != null && token.startsWith("mock-jwt-token-");
    }

    public String getSigningKey() {
        return this.SECRET_KEY;
    }
}
