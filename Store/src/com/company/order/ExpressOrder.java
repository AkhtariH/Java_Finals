package com.company.order;

import java.time.LocalDate;
import java.util.ArrayList;

public class ExpressOrder extends Order {

    private int orderPrice = 10;

    public ExpressOrder(int orderID, LocalDate orderDate) {
        super(orderID, orderDate);
        products = new ArrayList<>();
    }
    @Override
    public int getOrderPrice() {
        return orderPrice;
    }

    @Override
    public int calculateTotalPrice() {
        return super.calculateTotalPrice() + getOrderPrice();
    }
}
