package com.company;

import com.company.order.ExpressOrder;
import com.company.store.Product;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ExpressOrderTest {

    @Test
    void getOrderPrice() {
        //Creating products
        Product p1 = new Product(6, "iPod", 415);
        Product p2 = new Product(7, "Airpods", 230);

        //LocalDate
        LocalDate date1 = LocalDate.now();

        //Creating orders
        ExpressOrder o1 = new ExpressOrder(3, date1);

        o1.addProduct(p1);
        o1.addProduct(p2);


        assertEquals(10, o1.getOrderPrice());
    }

    @Test
    void calculateTotalPrice() {
        //Creating products
        Product p1 = new Product(6, "iPod", 415);
        Product p2 = new Product(7, "Airpods", 230);

        //LocalDate
        LocalDate date1 = LocalDate.now();

        //Creating orders
        ExpressOrder o1 = new ExpressOrder(3, date1);

        o1.addProduct(p1);
        o1.addProduct(p2);

        assertEquals(655, o1.calculateTotalPrice());
    }
}