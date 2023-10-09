package com.examclouds.xx_exeptions.training;

public class ClassCastExceptions {
    public static void main(String[] args) {
      method(new int[0]);
    }

    private static void method(Object arg) {
        String x = (String) arg;
    }
}
