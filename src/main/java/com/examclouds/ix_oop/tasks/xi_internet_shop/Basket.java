package com.examclouds.ix_oop.tasks.xi_internet_shop;

import java.util.Arrays;

public class Basket {
    Product[] productsPurchased;

    public Basket(Product[] productsPurchased) {
        this.productsPurchased = productsPurchased;
    }

    public Product[] getProductsPurchased() {
        return productsPurchased;
    }

    public void setProductsPurchased(Product[] productsPurchased) {
        this.productsPurchased = productsPurchased;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "productsPurchased=" + Arrays.toString(productsPurchased) +
                '}';
    }
}
