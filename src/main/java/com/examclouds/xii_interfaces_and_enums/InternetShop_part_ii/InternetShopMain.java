package com.examclouds.xii_interfaces_and_enums.InternetShop_part_ii;

public class InternetShopMain {
    public static void main(String[] args) {


        Product[] kitchenProducts = {};
        Product[] bathProducts = {};
        Product[] bedroomProducts = {};
        Product[] purchasedProducts = {};
        Category category = new Category("Kitchen", kitchenProducts);
        Category category1 = new Category("Bath", bathProducts);
        Category category2 = new Category("Bedroom", bedroomProducts);

        Basket basket = new Basket(purchasedProducts);
        User user = new User("Vasya Ivanov", "qwerty12", basket);
    }
}
