package com.hospital.appointments;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully: " + appointment);
    }

    public List<Appointment> getAppointmentsForDate(Date date) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentDate().equals(date)) {
                result.add(appointment);
            }
        }
        return result;
    }

    public void cancelAppointment(String appointmentId) {
        appointments.removeIf(appointment -> appointment.getAppointmentId().equals(appointmentId));
        System.out.println("Appointment canceled successfully with ID: " + appointmentId);
    }
}
