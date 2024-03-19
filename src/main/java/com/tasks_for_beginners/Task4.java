package com.tasks_for_beginners;

public class Task4 {
    public static void main(String[] args) {
primeNumberCheck(7);
primeNumberCheck(43);
primeNumberCheck(24);
    }

    public static void primeNumberCheck(int a) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(a+ " is a prime number: " +isPrime);
    }
}

/*
Задача 4
Напишите проверку, является ли заданное число простым.
 */