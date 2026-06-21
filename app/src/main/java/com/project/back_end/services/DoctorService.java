package com.project.back_end.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

@Service
public class DoctorService {

    public List<String> getAvailableSlots(Long doctorId, String date) {
        return List.of("09:00 AM", "10:30 AM", "02:00 PM", "04:30 PM");
    }

    public Map<String, Object> validateDoctorLogin(String email, String password) {
        if ("doctor@clinic.com".equals(email) && "password123".equals(password)) {
            return Map.of("authenticated", true, "role", "DOCTOR", "name", "Dr. Amit Sharma");
        }
        return Map.of("authenticated", false, "message", "Invalid login credentials");
    }
}
