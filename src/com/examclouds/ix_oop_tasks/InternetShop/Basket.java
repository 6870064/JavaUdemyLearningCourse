package com.examclouds.ix_oop_tasks.InternetShop;

public class Basket {
    Product[] purchasedProducts;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }
}
