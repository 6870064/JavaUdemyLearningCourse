package com.examclouds.ix_oop_tasks.LibraryReadersTask;

import com.examclouds.ix_oop_tasks.LibraryReadersTask.enums.Faculty;

public class Reader {
    String FullName;
    int libraryCard;
    Faculty faculty;
    String dateBirth;
    String phoneNumber;

    public Reader(String fullName, int libraryCard, Faculty faculty, String dateBirth, String phoneNumber) {
        FullName = fullName;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
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

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "FullName='" + FullName + '\'' +
                ", libraryCard=" + libraryCard +
                ", faculty=" + faculty +
                ", dateBirth='" + dateBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(int bookAmount) {
        System.out.println(getFullName() + " has taken " + bookAmount + " books");
    }

    public void takeBook(String... books) {
        System.out.println(this.FullName + " has taken the books: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(getFullName() + " has taken the books: ");
        for (Book book : books) {
            System.out.println(book.getBookTitle() + ", author: " + book.getAuthorName());
        }
    }

    public void returnBook(int bookAmount) {
        System.out.println(getFullName() + " has returned " + bookAmount + " books");
    }

    public void returnBook(String... books) {
        System.out.println(this.FullName + " has taken the books: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(getFullName() + " has returned " + books.length + " books: ");
        for (Book book : books) {
            System.out.println(book.getBookTitle() + ", author: " + book.getAuthorName());
        }
    }
}
