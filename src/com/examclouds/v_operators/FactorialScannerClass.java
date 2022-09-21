package com.examclouds.v_operators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        int factorialNumber = 1;

        do {
            try {
                System.out.println("Введите целое число для расчет факториала");
                int a = scanner.nextInt();
                for (int i = 1; i <= a; i++) {
                    factorialNumber = factorialNumber * i;
                }
                System.out.println(String.format("%d - факториал числа %d", factorialNumber, a));
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели данные неверного формата");
                scanner.nextLine();
            }
        } while (continueLoop);
    }
}
