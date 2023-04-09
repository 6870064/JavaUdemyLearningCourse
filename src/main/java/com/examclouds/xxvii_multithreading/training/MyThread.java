package com.examclouds.xxvii_multithreading.training;


public class MyThread extends Thread {
    public void run() {
        System.out.println("Важная работа выполняется в потоке " +getName());
    }

    public void run(String s) {
        System.out.println("String in run is " +s);
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread() {
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

//    //  public MyThread(@NotNull String name) {
//        super(name);
//    }
}
