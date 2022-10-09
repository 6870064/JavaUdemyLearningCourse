package com.examclouds.ix_oop.tasks;

public class PersonMain {
    public static void main(String[] args) {
        Person myPerson = new Person();
        Person myPerson1 = new Person("Steve", 34);

        myPerson1.move();
        myPerson1.talk();
    }
}
