package com.examclouds.iii_language_vocabulary;

public class ConvertingAndCastingPrimitiveTypes {
    public static void main(String[] args) {
        int i = 11;
        byte b = 22;
        i = b;
        System.out.println(i);

        int j = 12;
        byte c = 23;
        c = (byte) j;
        System.out.println(c);

        double d = 3.89;
        int a = (int) d;

        int q = 323;
        byte w = (byte) q;
        System.out.println(w);

        double z = 389889877779.89;
        short s = (short) z;
        System.out.println(s);

        byte b1 = 1;
        int i1 = 2 * b1;
        int i2 = b1 * 2;

        byte n1 = 50, n2 = -99;
        n1 += n2;
        System.out.println("n1 = " + n1);


    }
}
