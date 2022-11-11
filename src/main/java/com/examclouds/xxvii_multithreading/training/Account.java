package com.examclouds.xxvii_multithreading.training;

public class Account implements Runnable {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(10);
            if (getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }


    private void makeWithdrawal(int amount) {
        if (getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " comletes the withdrawal. The balance is " + getBalance());
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + getBalance());
        }
    }
}
