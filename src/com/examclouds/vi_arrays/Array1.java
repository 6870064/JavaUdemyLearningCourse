package com.examclouds.vi_arrays;

public class Array1 {
    public static void main(String[] args) {
        monthDetermine("Февраль",2);
        monthDetermine("Декабрь", 11);
        monthDetermine("Сентябрь", 9);
    }

    public static void monthDetermine(String month, int monthNumber) {
        int[] monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
        System.out.println(String.format("В месяце %s %d дней",month, monthDays[monthNumber]));
    }
}
