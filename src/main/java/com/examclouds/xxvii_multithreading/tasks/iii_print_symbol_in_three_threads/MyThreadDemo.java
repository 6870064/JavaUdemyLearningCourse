package com.examclouds.xxvii_multithreading.tasks.iii_print_symbol_in_three_threads;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread one = new Thread(myThread);
        Thread two = new Thread(myThread);
        Thread three = new Thread(myThread);

        one.setName("The first thread");
        two.setName("The second thread");
        three.setName("The third thread");

        one.start();
        two.start();
        three.start();
    }
}
