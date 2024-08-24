package com.hospital.appointments;

import java.util.List;
import java.util.Date;

public class Scheduler {
    private AppointmentService appointmentService;

    public Scheduler(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    public void scheduleNewAppointment(String appointmentId, String patientId, String doctorId, Date appointmentDate) {
        Appointment appointment = new Appointment(appointmentId, patientId, doctorId, appointmentDate);
        appointmentService.scheduleAppointment(appointment);
    }

    public List<Appointment> viewAppointmentsByDate(Date date) {
        return appointmentService.getAppointmentsForDate(date);
    }

    public void cancelExistingAppointment(String appointmentId) {
        appointmentService.cancelAppointment(appointmentId);
    }
}
