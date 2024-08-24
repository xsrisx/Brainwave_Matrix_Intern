package com.hospital.appointments;

import java.util.Date;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private Date appointmentDate;

    public Appointment(String appointmentId, String patientId, String doctorId, Date appointmentDate) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentId() { return appointmentId; }
    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public Date getAppointmentDate() { return appointmentDate; }

    public void setAppointmentId(String appointmentId) { this.appointmentId = appointmentId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }
    public void setAppointmentDate(Date appointmentDate) { this.appointmentDate = appointmentDate; }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", appointmentDate=" + appointmentDate +
                '}';
    }
}
