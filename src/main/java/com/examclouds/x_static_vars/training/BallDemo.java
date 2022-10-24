package com.examclouds.x_static_vars.training;

public class BallDemo {
    public static void main(String[] args) {
        Ball ball = new Ball("red");
        Ball ball1 = new Ball("blue");
        System.out.println("Amount of objects created: " + Ball.count);
    }

}
