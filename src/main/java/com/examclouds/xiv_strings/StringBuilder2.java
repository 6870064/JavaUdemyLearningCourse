package com.examclouds.xiv_strings;

public class StringBuilder2 {
    public static void main(String[] args) {
        int a = 42;
        StringBuilder strBuilder = new StringBuilder("Hello world!");

        String s = strBuilder.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
