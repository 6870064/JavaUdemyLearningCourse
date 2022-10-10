package com.examclouds.ix_oop.tasks.iv_library_readers;

public class Reader {
    private String fullName;
    private int libraryCard;
    private String birthDate;
    private String phoneNumber;
    private Faculty faculty;

    public Reader(String fullName, int libraryCard, String birthDate, String phoneNumber, Faculty faculty) {
        this.fullName = fullName;
        this.libraryCard = libraryCard;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Метод, который принимает количество взятых книг
     *
     * @param booksAmount
     */
    public void takeBook(int booksAmount) {
        System.out.println(String.format("%s взял %s книг", getFullName(), booksAmount));
    }

    /**
     * метод, который принимает названия книг
     *
     * @param books
     */
    public void takeBook(String... books) {
        System.out.println(String.format("%s взял следующие книги: ", getFullName()));
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    /**
     * метод, принимающий объекты книги
     *
     * @param books
     */

    public void takeBook(Book... books) {
        System.out.println(String.format("%s взял следующие книги: ", getFullName()));
        int booksAmount = 0;
        for (Book book : books) {
            System.out.println(String.format("%s, автор - %s", book.getBookTitle(), book.getBookAuthor()));
            booksAmount++;
        }
        System.out.println();
        System.out.println(String.format("%s взял %s книг", getFullName(), booksAmount));
    }

    /**
     * метод, принимающий количество книг, которые вернул читатель
     *
     * @param booksAmount
     */

    public void returnBook(int booksAmount) {
        System.out.println(String.format("%s вернул %s книг", getFullName(), booksAmount));
    }

    /**
     * Метод, принимающий названия книг, которые вернул читатель
     *
     * @param books
     */
    public void returnBook(String... books) {
        System.out.println(this.getFullName() + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    /**
     * Метод, принимающий книги как обьекты
     * @param books
     */

    public void returnBook(Book... books) {
        System.out.println(this.getFullName() + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getBookTitle() + ", автор - " + book.getBookAuthor());
        }
        System.out.println();
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

    /**
     * Метод вывода на печать читателей, переданных как объекты
     */
    public void printReaders(Reader... readers) {
        System.out.println("Список читателей: ");
        for (Reader reader : readers) {
            System.out.println(reader.getFullName());
        }
    }

    /**
     * Метод вывода на печать читателей, переданных как массив
     */
    public void printReaders(Reader[]... readers) {
        System.out.println("Список читателей: ");
        for (Reader[] reader : readers) {
            System.out.println(reader);
        }
    }
}