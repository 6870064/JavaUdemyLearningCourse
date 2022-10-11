package com.examclouds.ix_oop_tasks.PersonTask;

public class PersonTaskMain {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Ivanov Ivan Ivanovich", 30);

        person1.move();
        person1.talk();
    }
}
