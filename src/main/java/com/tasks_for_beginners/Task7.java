package com.tasks_for_beginners;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {99, 98, 97, 96, 95, 94, 93};

        arrayReverse(array);
        arrayReverse(array1);

    }

    public static void arrayReverse(int[] array) {
        int temp;
        int length = array.length;

        for(int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }

        System.out.println("Инвертированный массив: ");
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}




// Задача 7. Напишите программу, которая инвертирует массив (меняет порядок элементов на противоположный).


