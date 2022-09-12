package com.examclouds.ix_oop_tasks.InternetShop;

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
