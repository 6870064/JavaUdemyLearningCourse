package com.examclouds.xiii_wrappers_classes;

public class WrapperDemo1 {

    Integer i1 = new Integer(42);
    Integer i2 = new Integer("42");
    Float f1 = new Float(3.14f);
    Float f2 = new Float("3.14f");

    Character c1 = new Character('c');

    public static void main(String[] args) {
        Boolean boolean1 = new Boolean(true);
        Boolean boolean2 = new Boolean("Some String"); // Если аргумент содержит любую другую строку,
        // просто будет создан объект, содержащий значение false. Исключение выброшено не будет

        System.out.println(boolean2);
    }
}
