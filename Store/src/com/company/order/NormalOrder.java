package com.company.order;

import java.time.LocalDate;
import java.util.ArrayList;

public class NormalOrder extends Order{

    public NormalOrder(int orderID, LocalDate orderDate) {
        super(orderID, orderDate);
        products = new ArrayList<>();
    }

    @Override
    public int calculateTotalPrice() {
        return super.calculateTotalPrice();
    }
}
