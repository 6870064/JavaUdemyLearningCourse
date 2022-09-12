package com.examclouds.iii_language_vocabulary;

public class Literals {
    public static void main(String[] args) {
        long a1 = 220433L;
        long a2 = 0x3FFl;

        int x1 = 878;
        int x2 = +878;
        int x3 = -878;

        int six = 06;
        int seven = 07;

        int b1 = 0X0005;
        int b2 = 0x7ddfffff;
        int b3 = 0xcccccccc;

        double d1 = 145454545.676767676;
        double d2 = .4; //число 0.4

        float f1 = 56.45455F;
        float f2 = 343434.454563F;
        float f3 = 78.45f;

        double d3 = 454545.454545D;
        double d4 = 654.321;
        double d5 = 54.32d;
        double d6 = 1.5e14;

        double d7 = 1.5E+14;
        double d8 = 1.5e-14;

        boolean e1 = true;
        boolean e2 = false;

        char g1 = 'n';
        char g2 = '#';

        char letter0 = '\u004F';
        char letter_a = '\141';

        System.out.println(letter0+ " " +letter_a);

        char h1 = 0x675;
        char h2 = 345;
        char h3 = (char)800000;

        char h4 = '\'';
        char h5 = '\n';

        String str0 = "MyProgram";
        String str1 = "first line\nsecond line";
        String str2 = "\"This is in quotes\"";
        String str3 = "\u004F letter";
        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
