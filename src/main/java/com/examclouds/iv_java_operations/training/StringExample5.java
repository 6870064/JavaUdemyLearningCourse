package com.examclouds.iv_java_operations.training;

import java.util.Objects;

public class StringExample5 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hi";

        System.out.println(str1.equals(str2));
        System.out.println(Objects.equals(str1, str2));

        System.out.println("Длина строки : " +str1.length());
    }
}
