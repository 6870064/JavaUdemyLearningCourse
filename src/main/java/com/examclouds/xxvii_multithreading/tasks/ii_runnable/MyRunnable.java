package com.examclouds.xxvii_multithreading.tasks.ii_runnable;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            int a = i % 10;
            if (a == 0) {
                System.out.println(i);
            }
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
