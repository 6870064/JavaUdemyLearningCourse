package com.examclouds.xii_interfaces_and_enums.tasks.v_InternetShop_part_ii;

import java.util.Scanner;

public class User {
    String userName;
    String Password;
    Basket basket;

    public User(String userName, String password, Basket basket) {
        this.userName = userName;
        Password = password;
        this.basket = basket;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public static void userLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user login");



    }
}
