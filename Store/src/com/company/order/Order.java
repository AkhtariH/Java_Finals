package com.company.order;

import com.company.Printable;
import com.company.store.Product;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Order implements Printable {

    private int orderID;
    public ArrayList<Product> products;
    private LocalDate orderDate;
    private int orderPrice = 0;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        products = new ArrayList<>();
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void addProduct(Product p)
    {
        products.add(p);
    }

    public void productsName()
    {
        System.out.println("Items: ");
        int count = 0;
        for(Product p: products)
        {
            count++;
            if(count == products.size())
            {
                System.out.print(p.getName()+";");
            }
            else {
                System.out.print(p.getName() + ", ");
            }
        }
        System.out.print("\n");
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int calculateTotalPrice() {

        int totalPrice = 0;
        for(Product p: products ){
            totalPrice += p.getPrice();
        }


        return totalPrice;

    }

    @Override
    public void printer() {
        System.out.println("Order ID: " + getOrderID() + "; Order date: " + getOrderDate() + "; Total price: " + calculateTotalPrice() + ";");
        productsName();
    }
}
