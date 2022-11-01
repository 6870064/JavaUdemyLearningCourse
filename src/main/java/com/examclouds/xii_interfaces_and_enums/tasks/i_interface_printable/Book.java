package com.examclouds.xii_interfaces_and_enums.tasks.i_interface_printable;

import java.util.Objects;

public class Book implements Printable {

    private String bookTitle;

    public Book(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                System.out.println(printable);
            }
        }
    }

    @Override
    public void print() {
        System.out.println(String.format("Printning book: %s", getBookTitle()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle);
    }
}
