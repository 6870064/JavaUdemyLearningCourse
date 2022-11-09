package com.examclouds.xii_interfaces_and_enums.tasks.v_InternetShop_part_ii;

public class Basket {
    Product[] purchasedProducts;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }
}
