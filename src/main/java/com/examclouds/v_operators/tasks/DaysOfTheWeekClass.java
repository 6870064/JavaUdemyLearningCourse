package com.examclouds.v_operators.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DaysOfTheWeekClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        int dayNumber = 0;

        do {
            try {
                System.out.println("Введите номер дня недели в диапазоне [1:7]");
                dayNumber = scanner.nextInt();
                switch (dayNumber){
                    case 1:
                        System.out.println("Понедельник");
                        break;
                    case 2:
                        System.out.println("Вторник");
                        break;
                    case 3:
                        System.out.println("Среда");
                        break;
                    case 4:
                        System.out.println("Четверг");
                        break;
                    case 5:
                        System.out.println("Пятница");
                    case 6:
                        System.out.println("Суббота");
                        break;
                    case 7:
                        System.out.println("Воскресенье");
                        break;
                    default:
                        System.out.println("Вы ввели число вне диапазона [1:7]");
                        break;
                }
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели данные неверного формата");
                scanner.nextLine();
            }
        } while (continueLoop);
    }
}
