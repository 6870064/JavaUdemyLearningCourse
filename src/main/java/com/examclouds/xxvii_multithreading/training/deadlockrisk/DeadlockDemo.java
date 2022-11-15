package com.examclouds.xxvii_multithreading.training.deadlockrisk;

public class DeadlockDemo {
    public static void main(String[] args) {
        DeadlockRisk job = new DeadlockRisk();
        Thread masha = new Thread(job, "Маша");
        Thread dasha = new Thread(job, "Даша");
        masha.start();
        dasha.start();
    }
}
