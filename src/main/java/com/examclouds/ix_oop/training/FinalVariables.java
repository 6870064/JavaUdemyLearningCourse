package com.examclouds.ix_oop.training;

public class FinalVariables {
    public static final int FILE_NEW = 1;
    private final String someString = "something";

    public static void print(final double d){
        //FILE_NEW = 2;
        final String str;
        str = "someString";
        System.out.println("FILE_NEW = " +FILE_NEW);
        System.out.println("str = " +str);
        System.out.println("d = " +d);
    }

    public static void main(String[] args) {
        print(3);
    }
}
