package com.examclouds.v_operators.tasks;

public class DaysOfTheWeeksSecondClass {
    public static void main(String[] args) {
        chooseDayOfTheWeek(1);
        chooseDayOfTheWeek(3);
        chooseDayOfTheWeek(6);
    }

    public static void chooseDayOfTheWeek(int dayNumber) {
        String dayOfTheWeek = "Понедельник";
        switch (dayNumber) {
            case 1:
                dayOfTheWeek = "Понедельник";
                break;
            case 2:
                dayOfTheWeek = "Вторник";
                break;
            case 3:
                dayOfTheWeek = "Среда";
                break;
            case 4:
                dayOfTheWeek = "Четверг";
                break;
            case 5:
                dayOfTheWeek = "Пятница";
            case 6:
                dayOfTheWeek = "Суббота";
                break;
            case 7:
                dayOfTheWeek = "Воскресенье";
                break;
            default:
                break;
        }
        System.out.println(String.format("%s - день недели под номером %d", dayOfTheWeek, dayNumber));
    }
}
