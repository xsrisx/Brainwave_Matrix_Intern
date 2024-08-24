package com.hospital.billing;

import java.util.ArrayList;
import java.util.List;

public class Billing {
    private List<Invoice> invoices = new ArrayList<>();

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "invoices=" + invoices +
                '}';
    }
}
