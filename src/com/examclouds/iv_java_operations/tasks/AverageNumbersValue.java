package com.examclouds.iv_java_operations.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageNumbersValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        double[] myArray = {1, 2, 3};
        double sum = 0;

        do {
            try {
                for (int i = 0; i < myArray.length; i++) {
                    System.out.println(String.format("Введите %s аргумент", i + 1));
                    myArray[i] = scanner.nextDouble();
                    sum += myArray[i];
                }
                System.out.println(String.format("%s - среднее значение трех вещественных чисел", sum / myArray.length));
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели данные неверного формата");
                scanner.nextLine();
            }
        } while (continueLoop);
    }
}
