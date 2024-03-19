package com.tasks_for_beginners;

public class Task6 {
    public static void main(String[] args) {
        convertToString(123, 12);
    }

    public static void convertToString(int number, int base) {

        String numberAsString = Integer.toString(number, base);
        System.out.println(number + " в системе исчисления " +base+ ": " +numberAsString);
    }
}

/*
Задача 6. Напишите на Java простой код, который переводит целое число в строку,
при том что его можно применить в любой системе счисления.
 */