package com.company;

import com.company.order.NormalOrder;
import com.company.store.Product;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NormalOrderTest {

    @Test
    void calculateTotalPrice() {
        //Creating products
        Product p1 = new Product(1, "TV", 135);
        Product p2 = new Product(2, "Mouse pad", 12);
        Product p3 = new Product(3, "iPhone XS", 756);

        //LocalDate
        LocalDate date1 = LocalDate.now();

        //Creating orders
        NormalOrder o1 = new NormalOrder(1, date1);

        //Adding products to order
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p3);


        assertEquals(903, o1.calculateTotalPrice());
    }
}