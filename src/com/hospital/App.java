package com.hospital;

import com.hospital.appointments.AppointmentService;
import com.hospital.billing.BillingService;
import com.hospital.ehr.EHRService;
import com.hospital.inventory.InventoryService;
import com.hospital.patients.PatientService;
import com.hospital.staff.StaffService;

public class App {
    public static void main(String[] args) {
        // Initialize services
        PatientService patientService = new PatientService();
        AppointmentService appointmentService = new AppointmentService();
        EHRService ehrService = new EHRService();
        BillingService billingService = new BillingService();
        InventoryService inventoryService = new InventoryService();
        StaffService staffService = new StaffService();

        // Add some test data or simulate user interactions
        System.out.println("Hospital Management System is up and running.");
    }
}
