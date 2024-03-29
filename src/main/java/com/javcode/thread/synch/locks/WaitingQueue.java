package com.javcode.thread.synch.locks;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

import static com.javcode.thread.ColorScheme.GREEN;
import static com.javcode.thread.ColorScheme.RED;

public class WaitingQueue {

    public static void main(String[] args) throws InterruptedException {
        int operators = 5;
        int customers = 21;

        SemaphoredServiceDesk serviceDesk = new SemaphoredServiceDesk(operators, customers);
        ExecutorService executorService = Executors.newCachedThreadPool();

        IntStream.range(0, customers)
                .forEach(client -> executorService.submit(()-> {
           serviceDesk.connect();

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(GREEN+ "Number of connected customers " + serviceDesk.getCustomersConnected());
                    System.out.println(RED + "Number of customers in a queue " +serviceDesk.getCustomersWaiting());
        }));

        executorService.shutdown();
        executorService.awaitTermination(30, TimeUnit.SECONDS);

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

        private int getCustomersWaiting() {
            return customersQueued.get();
        }

    }
}
