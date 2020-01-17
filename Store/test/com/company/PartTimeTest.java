package com.company;

import com.company.employee.PartTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartTimeTest {

    @Test
    void calculateSalary() {
        //Creating employee
        PartTime e1 = new PartTime(4, "Pip", 13);

        assertEquals(260, e1.calculateSalary());

    }

    @Test
    void getWorkingHours() {
        //Creating employee
        PartTime e1 = new PartTime(4, "Pip", 13);

        assertEquals(20, e1.getWorkingHours());

    }
}