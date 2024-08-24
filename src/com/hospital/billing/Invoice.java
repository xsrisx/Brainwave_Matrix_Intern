package com.hospital.billing;

import java.util.Date;

public class Invoice {
    private String invoiceId;
    private String patientId;
    private double amount;
    private Date date;

    public Invoice(String invoiceId, String patientId, double amount, Date date) {
        this.invoiceId = invoiceId;
        this.patientId = patientId;
        this.amount = amount;
        this.date = date;
    }

    public String getInvoiceId() { return invoiceId; }
    public String getPatientId() { return patientId; }
    public double getAmount() { return amount; }
    public Date getDate() { return date; }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceId='" + invoiceId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
