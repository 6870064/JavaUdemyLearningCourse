package com.examclouds.ix_oop.training;

public class Box5Demo {
    public static void main(String[] args) {
        Box5 myBox = new Box5(5,6,7);

        int x = 10;
        int y = 10;
        System.out.println("x и y перед вызовом: " +x+ " " +y);
        TestDemo.changePrimitives(x,y);
        System.out.println("x и y после вызова: " +x+ " " +y);

        System.out.println(String.format("box перед вызовом: %,.2f.0, %,.2f.0, %,.2f.0",myBox.width, myBox.height, myBox.width));
        TestDemo.changeObject(myBox);
        System.out.println(String.format("box после вызова: %,.2f.0, %,.2f.0, %,.2f.0",myBox.width, myBox.height, myBox.width));
    }
}
