package com.examclouds.xxvii_multithreading.training;

import com.examclouds.xii_interfaces_and_enums.training.internal_interfaces.A;

public class AccountDanger {
    public static void main(String[] args) {
        Account account = new Account();
        Thread one = new Thread(account);
        Thread two = new Thread(account);

        one.setName("Fred");
        one.setName("Lucy");
        one.start();
        one.start();
    }
}
