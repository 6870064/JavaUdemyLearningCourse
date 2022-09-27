package com.examclouds.vii_algoritms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myArray = {12, 221, 43, 56, 34, 94, 33, 90};
        int a = 221;
        System.out.println(binarySearch(myArray, a));

    }

    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
