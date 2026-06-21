package com.project.back_end.services;

import com.project.back_end.models.Appointment;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {
    private final List<Appointment> appointmentDatabase = new ArrayList<>();

    public Appointment bookAppointment(Appointment appointment) {
        appointmentDatabase.add(appointment);
        return appointment;
    }

    public List<Appointment> getAppointmentsForDoctorOnDate(Long doctorId, LocalDateTime date) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment app : appointmentDatabase) {
            if (app.getDoctor().getId().equals(doctorId) && 
                app.getAppointmentTime().toLocalDate().equals(date.toLocalDate())) {
                result.add(app);
            }
        }
        return result;
    }
}
