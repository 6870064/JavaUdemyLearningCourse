package com.javcode.thread;

import static com.javcode.thread.ColorScheme.GREEN;
import static com.javcode.thread.ColorScheme.YELLOW;

public class CompetitorMain {
    public static void main(String[] args) {
        SimpleThread th1 = new SimpleThread();
        th1.start();

        SimpleThread th2 = new SimpleThread();
        th2.start();

        Thread th3 = new Thread(new SimpleRunner());
        th3.start();

        System.out.println("Hello from main");

    }
}

class SimpleThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(YELLOW + "WARN - " + currentThread().getName() + " was interrupted");
            }
            System.out.println(GREEN + "INFO - " + currentThread().getName() + " - " + i);
        }
    }
}

class SimpleRunner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(YELLOW + "WARN - " + Thread.currentThread().getName() + " was interrupted");
            }
            System.out.println(GREEN + "INFO - " + Thread.currentThread().getName() + " - " + i);
        }
    }
}
