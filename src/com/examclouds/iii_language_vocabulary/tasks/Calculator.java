package com.examclouds.iii_language_vocabulary.tasks;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую переменную int");
        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }
        System.out.println("Введите вторую переменную int");
        if (scanner.hasNextInt()) {
            y = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }
        System.out.println("Выберите арифметическую операцию:\n" +
                "1 - Сложение;\n" +
                "2 - Вычитание\n" +
                "3 - Умножение\n" +
                "4 - Деление.");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Сумма чисел " + x + " и " + y + " равна " + summarizeInt(x, y));
                    break;
                case 2:
                    System.out.println("Результат вычитания чисел " + x + " и " + y + " равен " + subtractInt(x, y));
                    break;
                case 3:
                    System.out.println("Произведение чисел " + x + " и " + y + " равно " + multiplyInt(x, y));
                    break;
                case 4:
                    System.out.println("Остаток от деления числа " + x + " на " + y + " равен " + divideInt(x, y));
                    break;
                default:
                    System.out.println("Вы ввели число вне диапазона [1:4");
                    break;
            }

        } else {
            System.out.println("Вы ввели не целое число");
        }
    }

    public static int summarizeInt(int a, int b) {
        return a + b;
    }

    public static int subtractInt(int a, int b) {
        return a - b;
    }

    public static int multiplyInt(int a, int b) {
        return a * b;
    }

    public static int divideInt(int a, int b) {
        return a / b;
    }
}

/**
 * 3. Калькулятор
 * Создать метод принимающий на вход две переменные типа int.
 * Метод вычисляет их сумму и возвращает значение.
 * Вызвать этот метод из метода main.
 * Сделать методы для вычисления разницы, произведения и деления.
 */