package com.examclouds_2024.vi_arrays.tasks;

public class Task4 {
    public static void main(String[] args) {
        char[][] charArray = {
                {'\u039A', '\u041A'},
                {'\u033A', '\u044A'},
                {'\u029A', '\u019A'},
                {'\u069A', '\u059A'}};

        for (char[] charOneD: charArray) {
            for (char element : charOneD) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}


/*
4. Двумерный массив типа char.
Создать двумерный массив типа char размером 4х2.
Записать в него значения с помощью блока для инициализации.
Распечатать значения массива.
 */
