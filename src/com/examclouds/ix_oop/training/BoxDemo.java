package com.examclouds.ix_oop.training;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(12,10,10);
        Box box1 = new Box(11, 8, 12);

        System.out.println(String.format("Volume of the box is %,.2f.0",box.getVolume()));
        System.out.println(String.format("Volume of the box is %,.2f.0",box1.getVolume()));
    }
}
