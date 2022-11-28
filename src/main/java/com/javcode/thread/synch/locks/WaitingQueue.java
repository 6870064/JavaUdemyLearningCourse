package com.javcode.thread.synch.locks;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class WaitingQueue {

    public static void main(String[] args) throws InterruptedException {

    }

    private static class SemaphoredServiceDesk {
        private final AtomicInteger connectedCustomers = new AtomicInteger();
        private final AtomicInteger customersQueued;

        private final Semaphore semaphore;

        public SemaphoredServiceDesk(int operatorsNum, int customersNumber) {
            semaphore = new Semaphore(operatorsNum);
            customersQueued = new AtomicInteger(customersNumber);
        }

        public void connect() {
            Random random = new Random();
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            connectedCustomers.incrementAndGet();
            customersQueued.decrementAndGet();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                disconnect();
            }
        }

        private void disconnect() {
            semaphore.release();
            connectedCustomers.decrementAndGet();
        }

        private int getCustomersConnected() {
            return connectedCustomers.get();
        }

    }
}
