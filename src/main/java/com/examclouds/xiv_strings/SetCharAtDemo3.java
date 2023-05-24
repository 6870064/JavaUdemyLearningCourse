package com.examclouds.xiv_strings;

public class SetCharAtDemo3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello world!!!");
        System.out.println(str);

        System.out.println("str(5)" + str.charAt(5));
        str.setCharAt(9, 's');
        str.setLength(9);
        System.out.println(str);
    }
}
