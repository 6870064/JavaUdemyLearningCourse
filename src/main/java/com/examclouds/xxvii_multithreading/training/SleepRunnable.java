package com.examclouds.xxvii_multithreading.training;

public class SleepRunnable implements Runnable {

    @Override
    public void run() {
        for (int x = 1; x < 4; x++) {
            System.out.println(String.format("Run by %s, x is %s", Thread.currentThread().getName(), x));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
