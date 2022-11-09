package com.examclouds.xxvii_multithreading.training;

public class NameThreadDemo {
    public static void main(String[] args) {
        NameRunnable nr = new NameRunnable();
        Thread tread1 = new MyThread(nr);

        tread1.setName("First Thread");
        tread1.start();

        Thread thread2 = new Thread(nr, "Second Thread");
        thread2.start();

    }
}
