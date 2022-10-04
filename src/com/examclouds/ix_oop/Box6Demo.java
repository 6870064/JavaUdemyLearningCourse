package com.examclouds.ix_oop;

public class Box6Demo {
    public static void main(String[] args) {
        Box6 myBox1 = new Box6(10, 20, 15);
        Box6 myBox2 = new Box6();
        Box6 myBox3 = new Box6(7);


        System.out.println(String.format("Объем MyBox1 = %,.2f.0", myBox1.getVolume()));
        System.out.println(String.format("Объем MyBox2 = %,.2f.0", myBox2.getVolume()));
        System.out.println(String.format("Объем MyBox3 = %,.2f.0", myBox3.getVolume()));
    }
}
