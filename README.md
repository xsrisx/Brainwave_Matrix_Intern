# Hospital Management System

## Overview

This Java-based Hospital Management System manages various aspects of a healthcare facility, including:

- Patient Management
- Appointment Scheduling
- Electronic Health Records (EHR)
- Billing and Invoicing
- Inventory Management for Medical Supplies
- Staff Management

## Project Structure


hospital-management-system/
│
└── src/
│   └── com/
│   |   └── hospital/
│   |       └── App.java
│   │       └── patients/
│   │       |   │── Patient.java
│   │       |   │── PatientRegistration.java
│   │       |   └── PatientService.java
│   │       └── appointments/
│   │       |   ├── Appointment.java
│   │       |   ├── AppointmentService.java
│   │       |   └── Scheduler.java
│   │       └── ehr/
│   │       │   ├── EHR.java
│   │       │   ├── EHRService.java
│   │       │   └── MedicalRecord.java
│   │       └── billing/
│   │       │   ├── Billing.java
│   │       │   ├── Invoice.java
│   │       │   └── BillingService.java
│   │       └── inventory/
│   │       │   ├── Inventory.java
│   │       │   ├── InventoryService.java
│   │       │   └── MedicalSupply.java
│   │       └── staff/
│   │           ├── Staff.java
│   │           ├── StaffService.java
│   │           └── StaffManagement.java
│   └── AppTest.java
│
└── README.md




## How to Run


#### Compile the Code

Use the following command to compile the code. This will compile all the Java files and place the compiled `.class` files in the `out/` directory.

javac src/com/hospital/**/*.java src/AppTest.java -d out/


#### 2. Run the Application

To run the application, execute the App class, which serves as the entry point of the application.

java -cp out/ com.hospital.App


#### 3. Run the Tests

To run the tests included in AppTest.java, which perform simple functionality checks, use the following command. This command enables assertions and runs the AppTest class.

javac -d out/ src/com/hospital/**/*.java src/AppTest.java
java -ea -cp out/ com.hospital.AppTest


Main Functionalities

    Patient Management:

        Patient.java: Represents patient details.
        PatientRegistration.java: Handles the registration of new patients.
        PatientService.java: Provides services related to patients.
    
    Appointment Scheduling:

        Appointment.java: Represents an appointment.
        AppointmentService.java: Manages appointments.
        Scheduler.java: Handles appointment scheduling.
    
    Electronic Health Records (EHR):

        EHR.java: Represents electronic health records.
        EHRService.java: Provides services for managing EHRs.
        MedicalRecord.java: Represents individual medical records.

    Billing and Invoicing:

        Billing.java: Handles billing operations.
        Invoice.java: Represents an invoice.
        BillingService.java: Manages billing and invoicing.
    Inventory Management:

        Inventory.java: Represents the inventory of medical supplies.
        InventoryService.java: Manages inventory operations.
        MedicalSupply.java: Represents medical supplies.
    
    Staff Management:

        Staff.java: Represents staff members.
        StaffService.java: Provides services related to staff.
        StaffManagement.java: Manages staff operations.