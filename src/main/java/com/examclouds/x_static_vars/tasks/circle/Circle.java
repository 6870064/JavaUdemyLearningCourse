package com.examclouds.x_static_vars.tasks.circle;

import static java.lang.Math.PI;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double circleSquare(double radius) {
        return radius * radius;
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
