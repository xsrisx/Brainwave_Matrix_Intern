package com.hospital.staff;

public class Staff {
    private String staffId;
    private String name;
    private String position;
    private double salary;

    public Staff(String staffId, String name, String position, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getStaffId() { return staffId; }
    public String getName() { return name; }
    public String getPosition() { return position; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
