package com.examclouds.xiv_strings;

public class IndexOfDemo {
    public static void main(String[] args) {
        String s = "Для работы со строками в языке Java использются "
                + "классы String, Builder, StringBuilder, StringBuffer";

        System.out.println(s);
        System.out.println("indexOf(S) = " + s.indexOf('S'));
        System.out.println("indexOf(r) = " + s.indexOf('r'));
        System.out.println("indexOf(String) = " + s.indexOf("String"));
        System.out.println("lastIndexOf(String) = " + s.indexOf("String"));
        System.out.println("indexOf(S, 60) = " + s.indexOf('S', 60));
        System.out.println("lastIndexOf(S, 70) = " + s.lastIndexOf('S', 70));
  }
        }
