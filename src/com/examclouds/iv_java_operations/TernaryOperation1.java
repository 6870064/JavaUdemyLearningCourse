package com.examclouds.iv_java_operations;

public class TernaryOperation1 {
    public static void main(String[] args) {

        Person person = new Person(17, true);
        Person person1 = new Person(19, false);
        Person person2 = new Person(32, true);

        personEntranceCheck(person);
        personEntranceCheck(person1);
        personEntranceCheck(person2);
    }

    public static boolean personEntranceCheck(Person person) {
        String s1 = "Проходите, хорошего просмотра!";
        String s2 = "Этот фильм не для вас. До свидания!";
        boolean checkResult = true;
        boolean checkEntrance = person.getAge() >= 18 & person.isTicketPurchased();
        person.note = checkEntrance ? s1 : s2;
        System.out.println(person);
        System.out.println();
        return checkEntrance;
    }
}
