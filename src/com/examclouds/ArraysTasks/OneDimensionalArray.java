package com.examclouds.ArraysTasks;

public class OneDimensionalArray {
    public static void main(String[] args) {
        String[] weekArray = new String[7];

        fillInArray(weekArray);
        printArray(weekArray);
    }

    private static void printArray(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    private static String[] fillInArray(String[] args) {
        args[0] = "Sunday";
        args[1] = "Monday";
        args[2] = "Tuesday";
        args[3] = "Wednesday";
        args[4] = "Thursday";
        args[5] = "Friday";
        args[6] = "Saturday";
        return args;
    }
}

/*
https://www.examclouds.com/java/java-core-russian/massivi-zadaniya

1. Одномерный массив типа String.
Создать массив типа String с размером 7.
Записать в него значения дней недели.
Вывести на консоль значение последнего элемента.
Смотрите решение задачи в видео.

Решение на Patreon.
 */