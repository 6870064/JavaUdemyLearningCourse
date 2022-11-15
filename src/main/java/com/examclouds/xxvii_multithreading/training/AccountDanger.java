package com.examclouds.xxvii_multithreading.training;

import com.examclouds.xii_interfaces_and_enums.training.internal_interfaces.A;

public class AccountDanger implements Runnable {
    Account account = new Account();

    public static void main(String[] args) {

        AccountDanger accountDanger = new AccountDanger();
        Thread one = new Thread(accountDanger);
        Thread two = new Thread(accountDanger);

        one.setName("Fred");
        one.setName("Lucy");
        one.start();
        one.start();
    }

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawl(10);
        }
    }

    private synchronized void makeWithdrawl(int amt) {
        if (account.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName()+ " is going to withdraw");

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            account.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal. The balance is " +account.getBalance());
        } else {
            System.out.println("Not enough in account for "+Thread.currentThread().getName()+ " to withdraw" +account.getBalance());
        }
    }
}
