package com.examclouds.ix_oop.task;

public class Person {
    public static String fullName;
    public static int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public static String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void move(){
        System.out.println(String.format("Person %s is moving", getFullName()));
    }

    public static void talk(){
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
