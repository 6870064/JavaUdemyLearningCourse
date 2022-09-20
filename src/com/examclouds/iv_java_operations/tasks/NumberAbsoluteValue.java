package com.examclouds.iv_java_operations.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberAbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] myArray = {1, 2, 3};
        double min = 0;
        boolean continueLoop = true;

        do {
            try {
                for (int i = 0; i < myArray.length; i++) {
                    System.out.println(String.format("Введите %s вещественное число", i + 1));
                    myArray[i] = scanner.nextDouble();
                    myArray[i] = myArray[i] < 0 ? -myArray[i] : myArray[i];
                }

                for (int i = 0; i < myArray.length - 1; i++) {
                    min = myArray[i];
                    min = min > myArray[i + 1] ? myArray[i + 1] : min;
                }
                System.out.println(min + " - меньшее по модулю из трех введенных чисел");
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели данные неверного формата");
                scanner.nextLine();
            }
        } while (continueLoop);
    }
}

/**
 * 2. Меньшее по модулю число
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 * Для ввода чисел используем класс Scanner.
 */