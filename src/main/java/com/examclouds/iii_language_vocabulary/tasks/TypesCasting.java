package com.examclouds.iii_language_vocabulary.tasks;

public class TypesCasting {
    public static void main(String[] args) {

        int a = 324565;
        long b = 456;
        double c = 3.45;
        System.out.println(intToByte(a));
        System.out.println(intToShort(a));
        System.out.println(intToChar(a));

        System.out.println(longToFloat(b));
        System.out.println(longToDouble(b));

        System.out.println(doubleToFloat(c));

    }

    public static byte intToByte(int a){
        return (byte)a;
    }

    public static short intToShort(int a){
        return (short) a;
    }

    public static char intToChar(int a){
        return (char) a;
    }

    public static double longToDouble(long b){
        return (double) b;
    }

    public static float longToFloat(long b){
        return (float) b;
    }

    public static float doubleToFloat(double c){
        return (float) c;
    }

}
