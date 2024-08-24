package com.hospital.billing;

import java.util.Date;

public class BillingService {
    private Billing billing = new Billing();

    public void generateInvoice(String invoiceId, String patientId, double amount) {
        Invoice invoice = new Invoice(invoiceId, patientId, amount, new Date());
        billing.addInvoice(invoice);
        System.out.println("Invoice generated successfully: " + invoice);
    }

    public Billing getBillingDetails() {
        return billing;
    }
}
