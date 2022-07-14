package com.examclouds.OOPTasks.StudentAspirantTask;

public class StudentAspirantMain {
    public static void main(String[] args) {
        Student student = new Student("Vasya", "Ivanov", 12);
        Student student1 = new Student("Petr", "Petrov", 12);
        Student student2 = new Student("Sergey", "Sergeev", 12);
        Aspirant aspirant = new Aspirant("Alexey", "Sidorov", 3);
        Aspirant aspirant1 = new Aspirant("Dmitry", "Koltsov", 3);
        Student student3 = new Aspirant("Oleg", "Kiselev", 2);
        Aspirant aspirant2 = new Aspirant("Ekaterina", "Sidorovich", 3);
        Student student4 = aspirant2; //Создать переменную типа Student, которая ссылается на объект типа Aspirant.
        Student[] students = {student, student1, student2, student3, student4, aspirant, aspirant1, aspirant2};

        student.setAverageMark(student.countScholarship(5, 4, 5, 3, 4, 5, 5, 4));
        student1.setAverageMark(student.countScholarship(5, 5, 5, 5, 5, 5, 5, 5, 5, 5));
        student2.setAverageMark(student2.countScholarship(5,5,5,4,5,5,5,5));
        student3.setAverageMark(student3.countScholarship(5,5,5,5,5,5,5));
        aspirant.setAverageMark(aspirant.countScholarship(5,5,5,5,5,5,5,5,5));
        aspirant1.setAverageMark(aspirant1.countScholarship(5,5,3,5,3,5,5,5,5));
        aspirant2.setAverageMark(aspirant2.countScholarship(5,5,3,5,3,5,4,5,5));

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].getFirstName() + " " + students[i].getLastName() + ". Amount of scholarship is " +students[i].getScholarship(students[i].getAverageMark()));
        }
    }
}
