package com.examclouds.ix_oop.tasks.inheritance_student_aspirant;

public class Student {
    private String firstName;
    private String lastName;
    Group group;
    private double averageMark;

    public Student(String firstName, String lastName, Group group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Student() {
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public static int getScholarship(double averageMark){
        int scholarship = averageMark == 5 ? 100 : 80;
        return scholarship;
    }

    protected static void printStudents(Student[] students){
        System.out.println("List of students: ");
        for (Student student : students){
            System.out.println(String.format("%s %s",student.firstName, student.lastName));
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}';
    }
}
