package com.examclouds.iv_java_operations;

import java.io.OutputStream;
import java.util.Objects;

public class StringExample6 {
    public static void main(String[] args) {
        String str1 = "Hello world. This is JAVA";
        String str2 = "Have a nice day";

        stringComparator(str1, str2);

        System.out.println(str1.equals(str2));
        System.out.println(Objects.equals(str1,str2));

        boolean strComp1  = str1.equals(str2);
        System.out.println(strComp1);
        boolean strComp2 = Objects.equals(str1, str2);
        System.out.println(strComp2);
    }

    public static void stringComparator(String str1, String str2){
        System.out.println(String.format("Длина строки 1 равна %s символов", str1.length()));
        System.out.println(String.format("Длина строки 2 равна %s символов", str2.length()));

        System.out.println(str1.equals(str2));
        System.out.println(Objects.equals(str1,str2));
    }
}
