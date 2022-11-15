package com.examclouds.xxvii_multithreading.training.inter_stream_communications;

public class Consumer implements Runnable {
    private final MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            myQueue.get();
        }
    }
}
