package com.examclouds.iv_java_operations.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParityCheck {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                String s1 = "Вы ввели четное число";
                String s2 = "Вы ввели нечетное число";
                System.out.println("Введите число для проверки");
                int a = scanner.nextInt();
                String note = a % 2 ==0 ? s1 : s2;
                System.out.println(note);
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не целое число");
                scanner.nextLine();
            }

        } while (continueLoop);
    }
}

/**
 * 1. Проверка четности числа
 * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нет.
 * Ввод числа осуществлять с помощью класса Scanner.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
