package com.company.employee;

public class Contractor extends Employee {

    private int workingHours = 30;

    public Contractor(int employeeID, String name, int paymentPerHour) {

        super(employeeID, name, paymentPerHour);
    }

    @Override
    public int getWorkingHours() {
        return workingHours;
    }

    @Override
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary();
    }
}
