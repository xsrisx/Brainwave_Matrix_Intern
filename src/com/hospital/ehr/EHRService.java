package com.hospital.ehr;

import java.util.HashMap;
import java.util.Map;

public class EHRService {
    private Map<String, EHR> ehrMap = new HashMap<>();

    public void createEHR(EHR ehr) {
        ehrMap.put(ehr.getPatientId(), ehr);
        System.out.println("EHR created successfully for patient ID: " + ehr.getPatientId());
    }

    public EHR getEHRByPatientId(String patientId) {
        return ehrMap.get(patientId);
    }

    public void addRecordToEHR(String patientId, MedicalRecord record) {
        EHR ehr = ehrMap.get(patientId);
        if (ehr != null) {
            ehr.addMedicalRecord(record);
            System.out.println("Record added successfully to EHR of patient ID: " + patientId);
        } else {
            System.out.println("EHR not found for patient ID: " + patientId);
        }
    }
}
