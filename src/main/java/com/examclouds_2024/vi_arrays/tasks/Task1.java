package com.examclouds_2024.vi_arrays.tasks;

public class Task1 {
    public static void main(String[] args) {
        String[] arrayString = new String[7];
        arrayString[0] = "Monday";
        arrayString[1] = "Tuesday";
        arrayString[2] = "Wednesday";
        arrayString[3] = "Thursday";
        arrayString[4] = "Friday";
        arrayString[5] = "Saturday";
        arrayString[6] = "Sunday";

        System.out.println(arrayString[arrayString.length-1]);
    }
}


/*
1. Одномерный массив типа String.
Создать массив типа String с размером 7.
Записать в него значения дней недели.
Вывести на консоль значение последнего элемента.
 */