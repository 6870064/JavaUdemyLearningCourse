package com.examclouds.iii_language_vocabulary.tasks;

import java.util.Scanner;

public class LiteralsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазоне [1;9]:\n" +
                " 1 логический\n" +
                " 2 строковый\n" +
                " 3 символьный\n" +
                " 4 целочисленный 2-й\n" +
                " 5 целочисленный 4-й\n" +
                " 6 целочисленный 8-й\n" +
                " 7 целочисленный 16-й\n" +
                " 8 литерал типа float\n" +
                " 9 литерал типа double\n");
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("true - логический литерал");
                    break;
                case 2:
                    System.out.println("bla bla bla - строковый литерал");
                    break;
                case 3:
                    System.out.println(" 'f' - символьный литерал");
                    break;
                case 4:
                    System.out.println("-127...127 - целочисленный (byte) 1-й");
                    break;
                case 5:
                    System.out.println("-32768..32767 - целочисленный (short) 2-й");
                    break;
                case 6:
                    System.out.println("-2,147,483,648..2,147,483,647 - целочисленный (int) 4-ый");
                    break;
                case 7:
                    System.out.println("-9,223,372,036,854,775,808..9,223,372,036,854,775,807 - целочисленный (long) 8-ый");
                    break;
                case 8:
                    System.out.println("34.456f - тип данных float");
                    break;
                case 9:
                    System.out.println("3.45 - тип данных double");
                    break;
                default:
                    System.out.println("Вы ввели число вне диапазона [1;9]");
            }
        } else System.out.println("Вы ввели не целое число");
    }
}
/**
 * 02. Создать программу, в которой при введении номера от 1 до 9 на консоль выводится литерал следующего вида:
 1 логический
 2 строковый
 3 символьный
 4 целочисленный 2-й
 5 целочисленный 4-й
 6 целочисленный 8-й
 7 целочисленный 16-й
 8 литерал типа float
 9 литерал типа double.
 */
