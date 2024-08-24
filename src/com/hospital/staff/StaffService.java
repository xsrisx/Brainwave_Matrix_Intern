package com.hospital.staff;

import java.util.HashMap;
import java.util.Map;

public class StaffService {
    private Map<String, Staff> staffList = new HashMap<>();

    public void addStaff(Staff staff) {
        staffList.put(staff.getStaffId(), staff);
        System.out.println("Staff added successfully: " + staff);
    }

    public Staff getStaffById(String staffId) {
        return staffList.get(staffId);
    }

    public void updateStaff(Staff staff) {
        staffList.put(staff.getStaffId(), staff);
        System.out.println("Staff updated successfully: " + staff);
    }

    public void removeStaff(String staffId) {
        staffList.remove(staffId);
        System.out.println("Staff removed successfully with ID: " + staffId);
    }
}
