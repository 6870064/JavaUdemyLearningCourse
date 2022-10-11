package com.examclouds.ix_oop_tasks.StudentAspirantTask;

public class Student {

    String firstName;
    String lastName;
    int group;
    double averageMark;

    public Student(String firstName, String lastName, int group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public double countScholarship(int... array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        averageMark = sum / array.length;
        return averageMark;
    }

    public int getScholarship(double averageMark) {
        double scholarship = 0.0;
        if (averageMark == 5.0) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        return (int) scholarship;
    }
}
