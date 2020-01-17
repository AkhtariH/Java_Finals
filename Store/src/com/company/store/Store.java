package com.company.store;

import com.company.employee.Employee;
import com.company.order.Order;
import com.company.store.Customer;

import java.util.ArrayList;
import java.util.HashMap;

public class Store {

    private String storeName;
    private HashMap<Customer, ArrayList<Order>> customersToOrder;
    private ArrayList<Customer> customersList;
    private ArrayList<Order> ordersList;
    private ArrayList<Employee> employeesList;
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_PURPLE = "\u001B[35m";

    public Store(String storeName) {
        this.storeName = storeName;
        this.customersToOrder = new HashMap<>();
        this.customersList = new ArrayList<>();
        this.ordersList = new ArrayList<>();
        this.employeesList = new ArrayList<Employee>();
    }

    public int calculateRevenue()
    {
        int revenue = 0;
        for(Order o: ordersList)
        {
            revenue += o.calculateTotalPrice();
        }
        return revenue;
    }

    public void printInfoOrder()
    {
        customersToOrder.forEach((key,value)->{
            //System.out.print(ANSI_GREEN + "\nCustomer: " + ANSI_RESET); key.printer();
            System.out.print(ANSI_GREEN + "Orders: \n" + ANSI_RESET);
            /*for (Order o : ordersList) {
                System.out.println("\n");
                o.printer();
            }*/

            for(int i = 0; i <= ordersList.size() - 1; i++){
                System.out.println("\n");
                try {
                    ordersList.get(i).printer();
                }catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println("Error: " + ex.getMessage());
                }

            }

            System.out.println(ANSI_PURPLE + "///////////////////////" + ANSI_RESET);
        });

    }
    public void printInfoCustomer()
    {
        customersToOrder.forEach((key,value)->{
            System.out.print(ANSI_GREEN + "Customer: " + ANSI_RESET);
            key.printer();

            System.out.print(ANSI_GREEN + "Orders: \n" + ANSI_RESET);
            for (Order o : value) {
                System.out.println("\n");
                o.printer();
            }
            System.out.println(ANSI_PURPLE + "///////////////////////" + ANSI_RESET);
        });

    }

    public void printInfoEmployee()
    {
        for (Employee e: employeesList) {
            System.out.print(ANSI_GREEN + "Employee: " + ANSI_RESET + e.getName());
            for (Order o : e.getOrders()) {
                System.out.println("\n");
                o.printer();
            }

            System.out.println(ANSI_PURPLE + "///////////////////////" + ANSI_RESET);
        }

    }

    public void customersToOrder(Customer c, ArrayList<Order> o)
    {
        this.customersToOrder.put(c, o);
    }
    public void addCustomerToList(Customer c)
    {
        this.customersList.add(c);
    }
    public void addOrderToList(Order o)
    {
        this.ordersList.add(o);
    }

    public void addEmployeeToList(Employee e)
    {
        this.employeesList.add(e);
    }
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public HashMap<Customer, ArrayList<Order>> getCustomersToOrder() {
        return customersToOrder;
    }


    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }

    public ArrayList<Order> getOrdersList() {
        return ordersList;
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }
}
