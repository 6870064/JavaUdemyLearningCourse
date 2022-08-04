package com.examclouds.OOPTasks.NumbersOutput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersOutput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.println("Enter A parameter value");
                int a = scanner.nextInt();
                System.out.println("Enter B parameter value");
                int b = scanner.nextInt();
                if (a < b) {
                    for (int i = a; i <= b; i++) {
                        System.out.println(i);
                    }
                    System.out.println();
                } else if (a > b) {
                    for (int i = a; i >= b; i--) {
                        System.out.println(i);
                    }
                    System.out.println();
                } else {
                    System.out.println("Both parameters are equal: " + a);
                }
                continueLoop = false;

            } catch (InputMismatchException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only integer parameters allowed");
            } finally {
                System.out.println("Finally block is called");
            }
        } while (continueLoop);
    }
}

/*
4. Рекурсивный вывод чисел
Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания,
если A < B, или в порядке убывания в противном случае.
реализовать введение чисел с клавиатуры, реализовать необходимые Exceptions
 */