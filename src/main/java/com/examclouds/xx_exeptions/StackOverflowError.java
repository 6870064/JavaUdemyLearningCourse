package com.examclouds.xx_exeptions;

public class StackOverflowError {
    public static void main(String[] args) {
        System.out.println("1");
        main(args);
    }
}
