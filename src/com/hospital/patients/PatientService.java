package com.hospital.patients;

import java.util.HashMap;
import java.util.Map;

public class PatientService {
    private Map<String, Patient> patients = new HashMap<>();

    public void registerPatient(Patient patient) {
        patients.put(patient.getId(), patient);
        System.out.println("Patient registered successfully: " + patient);
    }

    public Patient getPatientById(String id) {
        return patients.get(id);
    }

    public void updatePatient(Patient patient) {
        patients.put(patient.getId(), patient);
        System.out.println("Patient updated successfully: " + patient);
    }

    public void deletePatient(String id) {
        patients.remove(id);
        System.out.println("Patient removed successfully with ID: " + id);
    }
}
