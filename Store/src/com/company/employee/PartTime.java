package com.company.employee;

public class PartTime extends Employee {

    private int workingHours = 20;

    public PartTime(int employeeID, String name, int paymentPerHour) {
        super(employeeID, name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }

    @Override
    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
