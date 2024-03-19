package com.tasks_for_beginners;

public class Task3 {
    public static void main(String[] args) {
toFindFactorial(10);
    }

    public static void toFindFactorial(int a) {

        int factorial = 1; // Изначально присваиваем факториалу значение 1

        // Используем цикл for для нахождения факториала
        for (int i = 1; i <= a; i++) {

            factorial *= i; // Умножаем текущее значение факториала на текущее значение i
            System.out.println(factorial+ " " +i);
        }
        // Выводим результат
        System.out.println("Factorial of " +a+ " is equal " +factorial);
    }
}


/*
Задача 3
Найдите факториал заданного числа.
 */