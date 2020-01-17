package com.company;

import com.company.employee.Contractor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractorTest {

    @Test
    void calculateSalary() {
        Contractor e3 = new Contractor(3, "Malcolm", 20);
        assertEquals(600, e3.calculateSalary());
    }

    @Test
    void getWorkingHours() {
        Contractor e3 = new Contractor(3, "Malcolm", 20);
        assertEquals(30, e3.getWorkingHours());
    }

}