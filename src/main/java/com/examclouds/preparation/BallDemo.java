package com.examclouds.preparation;

import static com.examclouds.preparation.Ball.count;

public class BallDemo {
    public static void main(String[] args) {
        Ball ball1 = new Ball("red");
        Ball ball2 = new Ball("blue");
        System.out.println("amount of objects created: " +count);
    }
}
