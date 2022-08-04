package com.company.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingCopy2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        do {
            try {
                System.out.println("Please enter numerator");
                int numerator = scanner.nextInt();
                System.out.println("Please enter denominator");
                int denominator = scanner.nextInt();
                System.out.println(divide(numerator, denominator));
                continueLoop = false;
            } catch (ArithmeticException e) {
                System.out.println("Exception : " + e);
                scanner.nextLine();
                System.out.println("Only non-zero parameters allowed");
            } catch (InputMismatchException e) {
                System.out.println("Exception :" +e);
                scanner.nextLine();
                System.out.println("Only integer values are allowed");
            }

            System.out.println("Try catch block is finished");
        } while (continueLoop);

    }

    private static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
