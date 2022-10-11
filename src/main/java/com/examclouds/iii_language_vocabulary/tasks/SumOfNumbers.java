package com.examclouds.iii_language_vocabulary.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        boolean continueLoop = true;

        do {
            try {
                System.out.println("Введите первое число");
                a = scanner.nextInt();
                System.out.println("Введите второе число");
                b = scanner.nextInt();
                System.out.println("Сумма чисел " + a + " и " + b + " равна " + counter(a, b));
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Допустимо введение только целых чисел");
                scanner.nextLine();
            }
        } while (continueLoop);
    }

    public static int counter(int x, int y) {
        return x + y;
    }
}

/**
 * 6. Сумма чисел
 * Создать программу, которая будет вычислять и выводить на экран
 * сумму двух целых чисел, введённых пользователем
 * с помощью класса Scanner. Если пользователь некорректно
 * введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
