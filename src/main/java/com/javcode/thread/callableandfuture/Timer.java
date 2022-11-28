package com.javcode.thread.callableandfuture;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Timer {
    public Instant start;
    public Instant end;

    public double timeInSeconds() {
        return Duration.between(start, end).toMillis() / 1000.0;
    }
}

class CallableFutureBase {

    public static void main(String[] args) {
        List<Future<Double>> futures = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 30; i++) {
            futures.add(executorService.submit(() -> {
                Timer timer = new Timer();
                Random random = new Random();
                timer.start = Instant.now();
                int rand = random.nextInt(5000);
                if (rand > 3000) {
                    throw new RuntimeException("Thread is running too long. Terminating...");
                }
                Thread.sleep(rand);
                timer.end = Instant.now();
                return timer.timeInSeconds();
            }));
        }

        executorService.shutdown();

        futures.parallelStream()
                .map(f-> {
                    try {
                        return f.get();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    return 0;
                })
                .forEach(t-> System.out.println("Thread execution time "+t));



    }
}


