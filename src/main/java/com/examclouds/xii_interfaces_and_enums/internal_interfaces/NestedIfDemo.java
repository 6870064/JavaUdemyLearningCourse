package com.examclouds.xii_interfaces_and_enums.internal_interfaces;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIf nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("Число не отрицательное");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("Это не будет выведено");
        }
    }
}
