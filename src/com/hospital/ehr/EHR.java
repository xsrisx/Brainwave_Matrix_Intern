package com.hospital.ehr;

import java.util.HashMap;
import java.util.Map;

public class EHR {
    private String patientId;
    private Map<String, MedicalRecord> records = new HashMap<>();

    public EHR(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientId() { return patientId; }

    public void addMedicalRecord(MedicalRecord record) {
        records.put(record.getRecordId(), record);
    }

    public MedicalRecord getMedicalRecord(String recordId) {
        return records.get(recordId);
    }

    public void updateMedicalRecord(MedicalRecord record) {
        records.put(record.getRecordId(), record);
    }

    public void deleteMedicalRecord(String recordId) {
        records.remove(recordId);
    }

    @Override
    public String toString() {
        return "EHR{" +
                "patientId='" + patientId + '\'' +
                ", records=" + records +
                '}';
    }
}
