package com.hospital;

import com.hospital.patients.Patient;
import com.hospital.patients.PatientRegistration;
import com.hospital.patients.PatientService;
import com.hospital.appointments.Appointment;
import com.hospital.appointments.AppointmentService;
import com.hospital.appointments.Scheduler;
import com.hospital.ehr.EHR;
import com.hospital.ehr.EHRService;
import com.hospital.ehr.MedicalRecord;
import com.hospital.billing.Billing;
import com.hospital.billing.Invoice;
import com.hospital.billing.BillingService;
import com.hospital.inventory.Inventory;
import com.hospital.inventory.InventoryService;
import com.hospital.inventory.MedicalSupply;
import com.hospital.staff.Staff;
import com.hospital.staff.StaffService;
import com.hospital.staff.StaffManagement;

public class AppTest {

    public static void main(String[] args) {
        testPatientRegistration();
        testAppointmentScheduling();
        testEHRManagement();
        testBilling();
        testInventoryManagement();
        testStaffManagement();
    }

    public static void testPatientRegistration() {
        System.out.println("Testing Patient Registration...");
        Patient patient = new Patient("P001", "John Doe", "1234567890");
        PatientRegistration registration = new PatientRegistration();
        registration.register(patient);
        PatientService service = new PatientService();
        Patient registeredPatient = service.getPatient("P001");
        assert registeredPatient != null : "Patient should be registered.";
        assert registeredPatient.getName().equals("John Doe") : "Patient name should be John Doe.";
        System.out.println("Patient Registration test passed.");
    }

    public static void testAppointmentScheduling() {
        System.out.println("Testing Appointment Scheduling...");
        Appointment appointment = new Appointment("A001", "P001", "2024-08-15");
        AppointmentService appointmentService = new AppointmentService();
        appointmentService.schedule(appointment);
        Scheduler scheduler = new Scheduler();
        Appointment scheduledAppointment = scheduler.getAppointment("A001");
        assert scheduledAppointment != null : "Appointment should be scheduled.";
        assert scheduledAppointment.getPatientId().equals("P001") : "Patient ID should be P001.";
        System.out.println("Appointment Scheduling test passed.");
    }

    public static void testEHRManagement() {
        System.out.println("Testing EHR Management...");
        EHR ehr = new EHR("EHR001", "P001");
        EHRService ehrService = new EHRService();
        ehrService.addRecord(ehr);
        MedicalRecord record = ehrService.getRecord("EHR001");
        assert record != null : "EHR record should be added.";
        assert record.getPatientId().equals("P001") : "Patient ID should be P001.";
        System.out.println("EHR Management test passed.");
    }

    public static void testBilling() {
        System.out.println("Testing Billing...");
        Billing billing = new Billing("B001", "P001", 200.0);
        BillingService billingService = new BillingService();
        billingService.generateInvoice(billing);
        Invoice invoice = billingService.getInvoice("B001");
        assert invoice != null : "Invoice should be generated.";
        assert invoice.getAmount() == 200.0 : "Invoice amount should be 200.0.";
        System.out.println("Billing test passed.");
    }

    public static void testInventoryManagement() {
        System.out.println("Testing Inventory Management...");
        MedicalSupply supply = new MedicalSupply("S001", "Bandage", 100);
        Inventory inventory = new Inventory();
        InventoryService inventoryService = new InventoryService();
        inventoryService.addSupply(supply);
        MedicalSupply fetchedSupply = inventoryService.getSupply("S001");
        assert fetchedSupply != null : "Medical supply should be added.";
        assert fetchedSupply.getName().equals("Bandage") : "Supply name should be Bandage.";
        System.out.println("Inventory Management test passed.");
    }

    public static void testStaffManagement() {
        System.out.println("Testing Staff Management...");
        Staff staff = new Staff("ST001", "Dr. Smith");
        StaffManagement staffManagement = new StaffManagement();
        staffManagement.addStaff(staff);
        Staff fetchedStaff = staffManagement.getStaff("ST001");
        assert fetchedStaff != null : "Staff should be added.";
        assert fetchedStaff.getName().equals("Dr. Smith") : "Staff name should be Dr. Smith.";
        System.out.println("Staff Management test passed.");
    }
}
