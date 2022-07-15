package com.examclouds.OOPTasks.InternetShop;

public class Basket {
    Product[] purchasedProducts;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }
}
