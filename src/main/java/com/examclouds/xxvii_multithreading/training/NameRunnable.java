package com.examclouds.xxvii_multithreading.training;

public class NameRunnable implements Runnable {
    public void run() {
        System.out.println("NameRunnable is running");
        System.out.println("Run by " + Thread.currentThread().getName());
    }
}
