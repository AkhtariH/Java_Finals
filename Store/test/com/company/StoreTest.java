package com.company;

import com.company.employee.Contractor;
import com.company.employee.Employee;
import com.company.employee.FullTime;
import com.company.employee.PartTime;
import com.company.order.ExpressOrder;
import com.company.order.NormalOrder;
import com.company.order.Order;
import com.company.store.Customer;
import com.company.store.Product;
import com.company.store.Store;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @org.junit.jupiter.api.Test
    void calculateRevenue() {
        //Creating store
        Store store = new Store("Media Markt");

        //Creating products
        Product p1 = new Product(1, "TV", 135);
        Product p2 = new Product(2, "Mouse pad", 12);
        Product p3 = new Product(3, "iPhone XS", 756);
        Product p4 = new Product(4, "iPad", 567);
        Product p5 = new Product(5, "Samsung", 5);
        Product p6 = new Product(6, "iPod", 415);
        Product p7 = new Product(7, "Airpods", 230);

        //LocalDate
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now();
        LocalDate date3 = LocalDate.now();

        //Creating orders
        NormalOrder o1 = new NormalOrder(1, date1);
        NormalOrder o2 = new NormalOrder(2, date2);
        ExpressOrder o3 = new ExpressOrder(3, date3);

        //Adding orders to list
        store.addOrderToList(o1);
        store.addOrderToList(o2);
        store.addOrderToList(o3);

        //Adding products to order
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p3);
        o2.addProduct(p4);
        o2.addProduct(p5);
        o3.addProduct(p6);
        o3.addProduct(p7);


        assertEquals(2130, store.calculateRevenue());
    }

    @org.junit.jupiter.api.Test
    void getStoreName() {
        //Creating store
        Store store = new Store("Media Markt");

        assertEquals("Media Markt", store.getStoreName());
    }

    @Test
    void getCustomerList(){
        //Creating store
        Store store = new Store("Media Markt");

        //Creating customers
        Customer c1 = new Customer(1, "Arnold");
        Customer c2 = new Customer(2, "Bob");
        Customer c3 = new Customer(3, "Hemon");

        //Adding customers to list
        store.addCustomerToList(c1);
        store.addCustomerToList(c2);
        store.addCustomerToList(c3);

        ArrayList<Customer> testCustomerList = new ArrayList<>();
        testCustomerList.add(c1);
        testCustomerList.add(c2);
        testCustomerList.add(c3);

        assertEquals(testCustomerList, store.getCustomersList());
    }

    @Test
    void getEmployeesList(){
        //Creating store
        Store store = new Store("Media Markt");

        //Creating employees
        FullTime e1 = new FullTime(1, "Damon", 15);
        FullTime e2 = new FullTime(2, "Thom", 15);
        Contractor e3 = new Contractor(3, "Malcolm", 20);
        PartTime e4 = new PartTime(4, "Pip", 13);
        PartTime e5 = new PartTime(5, "Pop", 13);

        //Adding customers to list
        store.addEmployeeToList(e1);
        store.addEmployeeToList(e2);
        store.addEmployeeToList(e3);
        store.addEmployeeToList(e4);
        store.addEmployeeToList(e5);

        ArrayList<Employee> testEmployeeList = new ArrayList<>();
        testEmployeeList.add(e1);
        testEmployeeList.add(e2);
        testEmployeeList.add(e3);
        testEmployeeList.add(e4);
        testEmployeeList.add(e5);

        assertEquals(testEmployeeList, store.getEmployeesList());
    }

    @Test
    void getOrdersList(){
        //Creating store
        Store store = new Store("Media Markt");

        //LocalDate
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now();
        LocalDate date3 = LocalDate.now();

        //Creating orders
        NormalOrder o1 = new NormalOrder(1, date1);
        NormalOrder o2 = new NormalOrder(2, date2);
        ExpressOrder o3 = new ExpressOrder(3, date3);
        ExpressOrder o4 = new ExpressOrder(4, date3);

        //Adding customers to list
        store.addOrderToList(o1);
        store.addOrderToList(o2);
        store.addOrderToList(o3);
        store.addOrderToList(o4);

        ArrayList<Order> testOrderList = new ArrayList<>();
        testOrderList.add(o1);
        testOrderList.add(o2);
        testOrderList.add(o3);
        testOrderList.add(o4);

        assertEquals(testOrderList, store.getOrdersList());
    }

    @Test
    void getCustomersToOrder(){

        //Creating store
        Store store = new Store("Media Markt");

        //Creating customers
        Customer c1 = new Customer(1, "Arnold");
        Customer c2 = new Customer(2, "Bob");

        //Creating products
        Product p1 = new Product(1, "TV", 135);
        Product p2 = new Product(2, "Mouse pad", 12);
        Product p3 = new Product(3, "iPhone XS", 756);
        Product p4 = new Product(4, "iPad", 567);
        Product p5 = new Product(5, "Samsung", 5);
        Product p6 = new Product(6, "iPod", 415);
        Product p7 = new Product(7, "Airpods", 230);

        //LocalDate
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now();
        LocalDate date3 = LocalDate.now();

        //Creating orders
        NormalOrder o1 = new NormalOrder(1, date1);
        NormalOrder o2 = new NormalOrder(2, date2);
        ExpressOrder o3 = new ExpressOrder(3, date3);



        //Adding products to order
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p3);
        o2.addProduct(p4);
        o2.addProduct(p5);
        o3.addProduct(p6);
        o3.addProduct(p7);

        ArrayList<Order> o1Collection = new ArrayList<>();
        o1Collection.add(o1);
        o1Collection.add(o2);
        //Adding customers to order
        store.customersToOrder(c1, o1Collection);

        ArrayList<Order> o2Collection = new ArrayList<>();
        o2Collection.add(o2);
        o2Collection.add(o3);
        //Adding customers to order
        store.customersToOrder(c2, o2Collection);

        HashMap<Customer, ArrayList<Order>> testCustomerToOrder = new HashMap<>();
        testCustomerToOrder.put(c1, o1Collection);
        testCustomerToOrder.put(c2, o2Collection);

        assertEquals(testCustomerToOrder, store.getCustomersToOrder());
    }
}