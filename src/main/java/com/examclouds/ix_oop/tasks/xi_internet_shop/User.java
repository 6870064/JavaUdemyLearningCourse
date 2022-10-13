package com.examclouds.ix_oop.tasks.xi_internet_shop;

public class User {
    private String userLogin;
    private String passwordLogin;
    private Basket basket;

    public User(String userLogin, String passwordLogin, Basket basket) {
        this.userLogin = userLogin;
        this.passwordLogin = passwordLogin;
        this.basket = basket;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getPasswordLogin() {
        return passwordLogin;
    }

    public void setPasswordLogin(String passwordLogin) {
        this.passwordLogin = passwordLogin;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "User{" +
                "userLogin='" + userLogin + '\'' +
                ", passwordLogin='" + passwordLogin + '\'' +
                ", basket=" + basket +
                '}';
    }
}
