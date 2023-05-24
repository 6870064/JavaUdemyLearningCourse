package com.examclouds.xiv_strings;

public class InsertDemo {
    public static void main(String[] args) {
        StringBuilder strBuilder = new StringBuilder("I Java!");

        strBuilder.insert(2, "like ");
        System.out.println(strBuilder);
    }
}
