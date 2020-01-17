package com.company;

import com.company.store.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getName() {
        //Creating customers
        Customer c1 = new Customer(1, "Arnold");

        assertEquals("Arnold", c1.getName());
    }

    @Test
    void getCustomerID() {
        //Creating customers
        Customer c1 = new Customer(1, "Arnold");

        assertEquals(1, c1.getCustomerID());
    }

}