package com.company;

import com.company.store.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getProductID() {
        //Creating product
        Product p1 = new Product(1, "TV", 135);

        assertEquals(1, p1.getProductID());
    }

    @Test
    void getName() {
        //Creating product
        Product p1 = new Product(1, "TV", 135);

        assertEquals("TV", p1.getName());
    }

    @Test
    void getPrice() {
        //Creating product
        Product p1 = new Product(1, "TV", 135);

        assertEquals(135, p1.getPrice());
    }
}