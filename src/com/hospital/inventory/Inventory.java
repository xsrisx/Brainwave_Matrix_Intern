package com.hospital.inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, MedicalSupply> supplies = new HashMap<>();

    public void addSupply(MedicalSupply supply) {
        supplies.put(supply.getSupplyId(), supply);
    }

    public MedicalSupply getSupply(String supplyId) {
        return supplies.get(supplyId);
    }

    public void updateSupplyQuantity(String supplyId, int quantity) {
        MedicalSupply supply = supplies.get(supplyId);
        if (supply != null) {
            supply.setQuantity(quantity);
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "supplies=" + supplies +
                '}';
    }
}
