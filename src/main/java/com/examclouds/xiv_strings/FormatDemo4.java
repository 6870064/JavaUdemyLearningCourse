package com.examclouds.xiv_strings;

public class FormatDemo4 {
    public static void main(String[] args) {
        System.out.printf("Строка с форматированием: %.2f%n", 1000.0 / 3.0);
        System.out.format("%s, в следующем году вам будет %d", "Джон", 23);
        System.out.println();

        String str = String.format("Строка с форматированием: %16.2f", 1000.0 / 3.0);
        System.out.println(str);
    }



}
