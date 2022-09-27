package com.examclouds.vii_algoritms.training;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] myArray = {12,34,87,42,65,86,91,14,77};
        int a = 86;
        recursiveBinarySearch(myArray, 12, 77, a);

    }

    public static int recursiveBinarySearch(int[] array, int firstElement, int lastElement, int elementToSearch) {
        // условие прекращения
        if (lastElement >= firstElement) {
            int middle = (lastElement + firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middle] == elementToSearch) {
                return middle;
            }

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (array[middle] > elementToSearch) {
                return recursiveBinarySearch(array, firstElement, middle - 1, elementToSearch);
            }

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(array, middle + 1, lastElement, elementToSearch);
        }
        return -1;
    }
}
