package com.company;

import com.company.employee.FullTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FullTimeTest {

    @Test
    void calculateSalary() {
        //Creating employees
        FullTime e1 = new FullTime(1, "Damon", 15);

        assertEquals(600, e1.calculateSalary());
    }

    @Test
    void getWorkingHours() {
        //Creating employees
        FullTime e1 = new FullTime(1, "Damon", 15);

        assertEquals(40, e1.getWorkingHours());
    }
}