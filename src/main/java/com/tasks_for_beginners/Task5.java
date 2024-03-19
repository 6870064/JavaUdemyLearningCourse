package com.tasks_for_beginners;

import java.util.Arrays;
import java.util.Comparator;

public class Task5 {
    public static void main(String[] args) {
        int array[] = new int[]{25, 5, 12, 32, 56, 9, 0, 31, 2, 99};
        sortArrayAsc(array);
        sortArraysDesc(array);
    }

    //Метод, сортирующий по возрастанию массив и выводящий его на печать
    public static void sortArrayAsc(int[] array) {

        //Сортировка массива по возрастанию
        Arrays.sort(array);

        //Вывод отсортированного массива на печать
        System.out.println("Массив, отсортированный по возрастанию");
        for (int num: array) {
            System.out.println(num + " ");
        }
    }

    //Метод, сортирующий по убыванию массив и выводящий его на печать
    public static void sortArraysDesc(int[] array) {

        Integer[] boxedArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, Comparator.reverseOrder());

        System.out.println("\nМассив, отсортированный по убыванию");
        for (int num : boxedArray) {
            System.out.println(num + " ");
        }
    }
}

/*
Задача 5. Отсортируйте массив по значению в порядке возрастания и убывания.
 */