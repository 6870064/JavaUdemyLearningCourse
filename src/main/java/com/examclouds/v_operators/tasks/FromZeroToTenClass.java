package com.examclouds.v_operators.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FromZeroToTenClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        String str1 = "%d - положительное число меньше или равно 10 или ноль";
        String str2 = "%d - Положительное число больше 10 или отрицательное";

        do {
            try {
                System.out.println("Введите число от 0 до 10");
                int a = scanner.nextInt();
                String printNote = (a >= 0 & a <= 10) ? str1 : str2;
                System.out.println(String.format(printNote, a));
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели число неверного формата");
                scanner.nextLine();
            }
        } while (continueLoop);
    }
}
