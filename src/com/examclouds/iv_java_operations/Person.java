package com.examclouds.iv_java_operations;

public class Person {
    int Age;
    boolean ticketPurchased;
    boolean entraceAvailable;
    String note;

    public Person(int age, boolean ticketPurchased) {
        Age = age;
        this.ticketPurchased = ticketPurchased;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public boolean isTicketPurchased() {
        return ticketPurchased;
    }

    public void setTicketPurchased(boolean ticketPurchased) {
        this.ticketPurchased = ticketPurchased;
    }

    public boolean isEntraceAvailable() {
        return entraceAvailable;
    }

    public void setEntraceAvailable(boolean entraceAvailable) {
        this.entraceAvailable = entraceAvailable;
    }

    public String getNote() {
        return note;
    }

    public void setNote() {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Age=" + Age +
                ",\n ticketPurchased = " + ticketPurchased +
                ",\n entraceAvailable = " + entraceAvailable +
                ",\n note = '" + note + '\'' +
                '}';
    }
}
