package com.examclouds.v_operators.training;

public class SwitchCaseClass {
    public static void main(String[] args) {
        trafficLight(1);
        trafficLight(2);
        trafficLight(3);
        trafficLight(4);
    }

    public static void trafficLight(int i) {
        switch (i) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Green");
                break;
            default:
                System.out.println("You entered wrong value. Only [1:3] is allowed");
                break;
        }
    }
}