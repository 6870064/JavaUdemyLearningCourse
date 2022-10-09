package com.examclouds.ix_oop.tasks.iv_library_readers;

public class Book {
    public String bookTitle;
    public String bookAuthor;

    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public Book() {
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
