package com.examclouds.xxvii_multithreading.training.deadlockrisk;

public class DeadlockRisk implements Runnable {

    private final Resource scissors = new Resource();
    private final Resource paper = new Resource();

    public void doSun() {
        synchronized (scissors) { // May be deadlock here
            System.out.println(Thread.currentThread().getName() + " взяла ножницы для вырезания солнышка");
            synchronized (paper) {
                System.out.println(Thread.currentThread().getName() + " взяла бумагу для вырезания солнышка");
                System.out.println(Thread.currentThread().getName() + " вырезает солнышко");
            }
        }
    }

    public void doCloud() {
        synchronized (paper) {
            System.out.println(Thread.currentThread().getName() + " взяла бумагу для вырезания облачка");
            synchronized (scissors) {
                System.out.println(Thread.currentThread().getName() + " взяла ножницы для вырезания облачка");
                System.out.println(Thread.currentThread().getName() + " вырезает облачко");
            }
        }
    }

    @Override
    public void run() {
        doSun();
        doCloud();
    }

    private static class Resource {
    }


}
