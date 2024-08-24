package com.hospital.staff;

public class StaffManagement {
    private StaffService staffService;

    public StaffManagement(StaffService staffService) {
        this.staffService = staffService;
    }

    public void addNewStaff(String staffId, String name, String position, double salary) {
        Staff staff = new Staff(staffId, name, position, salary);
        staffService.addStaff(staff);
    }

    public Staff viewStaffById(String staffId) {
        return staffService.getStaffById(staffId);
    }

    public void updateExistingStaff(Staff staff) {
        staffService.updateStaff(staff);
    }

    public void removeStaff(String staffId) {
        staffService.removeStaff(staffId);
    }
}
