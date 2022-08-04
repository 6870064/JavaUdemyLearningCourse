package com.examclouds.OOPTasks.LibraryReadersTask;

public class Book {

    String authorName;
    String bookTitle;

    public Book(String authorName, String bookTitle) {
        this.authorName = authorName;
        this.bookTitle = bookTitle;
    }

    public Book() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

}
