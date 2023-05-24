package com.examclouds.xiv_strings;

public class AppendDemo {
    public static void main(String[] args) {
        int a = 42;
        StringBuilder stringbuilder = new StringBuilder(40);
        String s = stringbuilder.append(a).append("!").toString();
        System.out.println(stringbuilder);
    }
}
