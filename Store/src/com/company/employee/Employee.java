package com.company.employee;

import com.company.order.Order;

import java.util.ArrayList;

public abstract class Employee {
    private int employeeID;
    private String name;
    private int paymentPerHour;
    private int workingHours;
    public ArrayList<Order> orders;

    public Employee(int employeeID, String name, int paymentPerHour)
    {
        this.employeeID = employeeID;
        this.name = name;
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
        this.orders = new ArrayList<>();
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public void addOrder(Order o)
    {
        orders.add(o);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public int calculateSalary()
    {
        int salary = getPaymentPerHour()*getWorkingHours();

        return salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    public String toString()
    {
        return getEmployeeID() + getName() + getPaymentPerHour();
    }
}
