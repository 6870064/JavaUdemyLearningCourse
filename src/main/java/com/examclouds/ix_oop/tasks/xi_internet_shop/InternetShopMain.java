package com.examclouds.ix_oop.tasks.xi_internet_shop;

public class InternetShopMain {
    public static void main(String[] args) {

        Product product = new Product("Nandrolone", 30, 4.00);
        Product product1 = new Product("Sustanone", 25, 4.15);
        Product product2 = new Product("Winstrol", 20, 4.00);
        Product product3 = new Product("NFP", 25, 4.25);
        Product product4 = new Product("Drostanolone Propionat", 35, 4.55);
        Product product5 = new Product("Drostanolone Enanthate", 32, 4.85);

        Product[] violetProducts = {};
        Basket violetBasket = new Basket(violetProducts);

        User user = new User("Violet", "12345", violetBasket);

        Product[] steroidsArray = {product, product1, product2, product3, product4, product5};
        Category steroidsCategory = new Category("Steroids", steroidsArray);

        Product[] alcoholArray = {};
        Category alcoholCategory = new Category("Alcohol", alcoholArray);
    }
}
