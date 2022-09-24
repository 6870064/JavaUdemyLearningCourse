package com.examclouds.vi_arrays;

public class Array2 {
    public static void main(String[] args) {

        monthDetermine("Январь", 0);
        monthDetermine("Февраль", 1);
        monthDetermine("Декабрь", 11);
    }

    public  static void monthDetermine(String month, int monthNumber){
        int [] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(String.format("В месяце %s %d дней", month, monthDays[monthNumber]));
    }
}
