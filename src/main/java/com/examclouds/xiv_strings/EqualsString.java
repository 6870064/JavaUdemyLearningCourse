package com.examclouds.xiv_strings;

public class EqualsString {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String(s1);
        String s4 = new String(s1);
        System.out.println("s1 == s2 : " +(s1 == s2));
        System.out.println("s3 == s4 : " +(s3 == s4));
        System.out.println("s1 equals s2 : " +s1.equals(s2));
        System.out.println("s1 equals s3 : " +s1.equals(s3));
    }
}
