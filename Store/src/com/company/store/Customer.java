package com.company.store;

import com.company.Printable;
import com.company.order.Order;

import java.util.ArrayList;

public class Customer implements Printable {

    private int customerID;
    private String name;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }
//    public void addOrder(Order o)
//    {
//        orders.add(o);
//    }


    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printer() {
        System.out.println(getName());
    }
}
