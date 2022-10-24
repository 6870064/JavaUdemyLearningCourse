package com.examclouds.x_static_vars.training;

public class Ball {
    static int count = 0;
    String color = "none";

    public Ball(String color) {
        count++;
        this.color = color;
    }
}
