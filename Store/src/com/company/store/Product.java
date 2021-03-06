package com.company.store;

import com.company.PriceException;

public class Product {

    private int productID;
    private String name;
    private int price;

        public Product(int productID, String name, int price) throws PriceException {
            this.productID = productID;
            this.name = name;

            if (price <= 0) {
                throw new PriceException();
            }

            this.price = price;
        }

        public int getProductID() {
            return productID;
        }

        public void setProductID(int productID) {
            this.productID = productID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

}
