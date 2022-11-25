package com.javcode.thread.synch.locks;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedBuffer {

    private static final Lock monitor = new ReentrantLock();

    private static final Condition canRead = monitor.newCondition();
    private static final Condition canWrite = monitor.newCondition();

    public static void main(String[] args) {

    }

    private static void blockingWrite() {

    }

    private static void blockingRead() {

    }
}
