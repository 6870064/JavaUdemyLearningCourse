package com.examclouds.OOPTasks.PersonTask;

import com.examclouds.OOPTasks.PhoneClassTask.Phone;

public class PersonTaskMain {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Ivanov Ivan Ivanovich", 30);

        person1.move();
        person1.talk();
    }
}
