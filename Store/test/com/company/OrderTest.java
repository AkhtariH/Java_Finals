package com.company;

import com.company.order.NormalOrder;
import com.company.store.Product;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {


    @Test
    void getTotalPrice() {

        //Creating products
        Product p1 = new Product(4, "iPad", 567);
        Product p2 = new Product(5, "Samsung", 5);

        //LocalDate
        LocalDate date1 = LocalDate.now();

        NormalOrder o1 = new NormalOrder(2, date1);

        o1.addProduct(p1);
        o1.addProduct(p2);

        assertEquals(572, o1.calculateTotalPrice());
    }

    @Test
    void getOrderID() {
        //Creating products
        Product p1 = new Product(4, "iPad", 567);
        Product p2 = new Product(5, "Samsung", 5);

        //LocalDate
        LocalDate date1 = LocalDate.now();

        NormalOrder o1 = new NormalOrder(1, date1);

        o1.addProduct(p1);
        o1.addProduct(p2);

        assertEquals(1, o1.getOrderID());
    }

    @Test
    void getOrderPrice() {
        //Creating products
        Product p1 = new Product(4, "iPad", 567);
        Product p2 = new Product(5, "Samsung", 5);

        //LocalDate
        LocalDate date1 = LocalDate.now();

        NormalOrder o1 = new NormalOrder(1, date1);

        o1.addProduct(p1);
        o1.addProduct(p2);

        assertEquals(0, o1.getOrderPrice());
    }

}