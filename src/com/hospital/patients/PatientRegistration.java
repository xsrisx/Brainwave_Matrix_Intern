package com.hospital.patients;

public class PatientRegistration {
    private PatientService patientService;

    public PatientRegistration(PatientService patientService) {
        this.patientService = patientService;
    }

    public void registerNewPatient(String id, String name, String dob, String address, String phoneNumber) {
        Patient patient = new Patient(id, name, dob, address, phoneNumber);
        patientService.registerPatient(patient);
    }
}
