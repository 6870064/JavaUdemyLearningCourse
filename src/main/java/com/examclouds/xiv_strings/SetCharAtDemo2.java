package com.examclouds.xiv_strings;

public class SetCharAtDemo2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello world!");
        System.out.println(str);
        System.out.println("str.charAt(10) = " + str.charAt(10));
        str.setCharAt(10, 'f');
        str.setLength(8);
        System.out.println(str);
    }
}
