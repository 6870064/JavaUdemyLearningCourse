package com.examclouds.xx_exeptions.training;

public class ThrowGenerate {
    public static void main(String[] args) {

        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Выброс" +e);
        }
    }

    public static void throwOne() throws IllegalAccessException {
        System.out.println("Inside of throwOne");
        throw new IllegalAccessException("demo");
    }
}
