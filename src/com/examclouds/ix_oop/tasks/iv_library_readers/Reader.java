package com.examclouds.ix_oop.tasks.iv_library_readers;

public class Reader {
    public static String fullName;
    public int libraryCard;
    Faculty faculty;
    public String birthDate;
    public String phoneNumber;

    public Reader(String fullName, int libraryCard, Faculty faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public static String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void takeBook(Book...book){
        for (int i =0; i < book.length; i++) {
            System.out.print(book[i]);
        }
        System.out.println();
        System.out.println(String.format("%s взял % книг", getFullName(), book.length));
    }

    public static void takeBook(int booksAmount){
        System.out.println(String.format("%s взял %книг", getFullName(),booksAmount));
    }
}