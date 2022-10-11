package com.examclouds.v_operators.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenAndOddTernaryClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        int a = 0;
        String s1 = "Введенное число %s - четное";
        String s2 = "Введенное число %s - нечетное";

        do {
            try {
                System.out.println("Введите число");
                a = scanner.nextInt();
                String printText = a % 2 == 0 ? s1 : s2;
                System.out.println(String.format(printText, a));
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели данные неверного формата");
                scanner.nextLine();
            }
        } while (continueLoop);
    }
}
