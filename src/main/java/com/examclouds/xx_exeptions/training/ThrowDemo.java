package com.examclouds.xx_exeptions.training;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (NullPointerException e) {
            System.out.println("ПОВТОРНЫЙ перехват: " + e);
        }
    }

    public static void doSomething() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Перехвачено внутри doSomething.");
            throw e; // повторно возбудить исключение
        }
    }
}



