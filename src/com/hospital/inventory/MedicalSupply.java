package com.hospital.inventory;

public class MedicalSupply {
    private String supplyId;
    private String name;
    private int quantity;

    public MedicalSupply(String supplyId, String name, int quantity) {
        this.supplyId = supplyId;
        this.name = name;
        this.quantity = quantity;
    }

    public String getSupplyId() { return supplyId; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "MedicalSupply{" +
                "supplyId='" + supplyId + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
