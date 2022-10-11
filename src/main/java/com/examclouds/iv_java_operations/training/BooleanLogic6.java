package com.examclouds.iv_java_operations.training;

public class BooleanLogic6 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        boolean b5 = b1;
        boolean b6 = false;
        boolean b7 = false;

        boolean a = b1 & b2;
        boolean b = b1 | b2;
        boolean c = b1 ^ b2;

        if (b5 == b2) {
            b6 = true;
        }

        if (b1 != b2) {
            b7 = true;
        }


        System.out.println(b1+ " & " +b2+ " = " +a);
        System.out.println(b1+ " | " +b2+ " = " +b);
        System.out.println(!b2);
        System.out.println(c);
        System.out.println(b6);
        System.out.println(b7);
    }
}
