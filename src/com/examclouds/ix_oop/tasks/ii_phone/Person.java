package com.examclouds.ix_oop.tasks.ii_phone;

public class Person {
    public static String fullName;
    public static int age;

    public Person(String fullName, int age) {
        Person.fullName = fullName;
        Person.age = age;
    }

    public Person() {
    }

    public static String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        Person.fullName = fullName;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        Person.age = age;
    }

    public static void move() {
        System.out.println(String.format("Person %s is moving", getFullName()));
    }

    public static void talk() {
        System.out.println(String.format("Person with the age %s and the name %s is talking", getAge(), getFullName()));
    }

    @Override
    public String toString() {
        return "PersonTask{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
