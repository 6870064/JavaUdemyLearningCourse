package com.examclouds.x_static_vars.tasks.circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(4.00);
        Circle circle1 = new Circle(24.00);
        Circle circle2 = new Circle(12.00);

        System.out.println(Circle.circleSquare(circle.getRadius()));
        System.out.println(Circle.circumference(circle.getRadius()));
    }
}
