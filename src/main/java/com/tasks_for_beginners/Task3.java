package com.tasks_for_beginners;

public class Task3 {
    public static void main(String[] args) {
toFindFactorial(10);
    }

    public static void toFindFactorial(int a) {

        int factorial = 1;
        for (int i = 1; i <= a; i++) {

            factorial = factorial * i;
            System.out.println(factorial+ " " +i);
        }
        System.out.println("Factorial of " +a+ " is equal " +factorial);
    }
}


/*
Задача 3
Найдите факториал заданного числа.
 */