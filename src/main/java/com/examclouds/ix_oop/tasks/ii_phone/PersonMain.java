package com.examclouds.ix_oop.tasks.ii_phone;

public class PersonMain {
    public static void main(String[] args) {
        Person myPerson = new Person();
        Person myPerson1 = new Person("Steve", 34);

        Person.move();
        Person.talk();
    }
}
