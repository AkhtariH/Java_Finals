package com.company.employee;

public class FullTime extends Employee {

    private int workingHours = 40;

    public FullTime(int employeeID, String name, int paymentPerHour) {
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
