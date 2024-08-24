package com.hospital.inventory;

public class InventoryService {
    private Inventory inventory = new Inventory();

    public void addMedicalSupply(String supplyId, String name, int quantity) {
        MedicalSupply supply = new MedicalSupply(supplyId, name, quantity);
        inventory.addSupply(supply);
        System.out.println("Supply added successfully: " + supply);
    }

    public void updateMedicalSupplyQuantity(String supplyId, int quantity) {
        inventory.updateSupplyQuantity(supplyId, quantity);
        System.out.println("Supply quantity updated successfully for supply ID: " + supplyId);
    }

    public Inventory getInventoryDetails() {
        return inventory;
    }
}
