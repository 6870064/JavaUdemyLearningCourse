package com.examclouds.iii_language_vocabulary.tasks;

import java.util.Scanner;

public class NotesTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 3:\n" +
                "1 - однострочный комментарий\n" +
                "2 - многострочный комментарий\n" +
                "3 - документирующий комментарий\n");
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                System.out.println("// однострочный комментарий");
                break;
            case 2:
                System.out.println("/*\n" +
                        "многострочный\n" +
                        "комментарий\n" +
                        "*/");
                break;
            case 3:
                System.out.println(" /**\n" +
                        "документирующий комментарий\n" +
                        "**/");
                break;
            default:
                System.out.println("Вы ввели число вне диапазона [1:3]");
        }
    }
}
/**
 * 01. Создать программу, в которой используются однострочные и многострочные комментарии.
 * при введении номера от 1 до 3 на печать выводится соответствующего комментария
 **/


