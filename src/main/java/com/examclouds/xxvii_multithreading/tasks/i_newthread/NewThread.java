package com.examclouds.xxvii_multithreading.tasks.i_newthread;

public class NewThread extends Thread implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(String.format("Symbol 'K' %s",i));
        }
    }
}
