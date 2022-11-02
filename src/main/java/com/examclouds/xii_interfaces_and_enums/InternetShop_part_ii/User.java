package com.examclouds.xii_interfaces_and_enums.InternetShop_part_ii;

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
}
