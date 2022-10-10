package com.examclouds.ix_oop.tasks.iv_library_readers;

public class Book {
    private String bookTitle;
    private String bookAuthor;

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


    /**
     * Метод, принимающий массив книг
     * @param books
     */
    public static void printBooks(Book[]...books) {
        System.out.println("Список книг: ");
        for (Book book[] : books){
            System.out.println(book);
        }
        System.out.println();
    }

    /**
     * Метод, принимающий книги как объект
     * @param books
     */
    public static void printBooks(Book...books) {
        System.out.println("Список книг: ");
        for (Book book : books){
            System.out.println(book.bookTitle+ " " +book.bookAuthor);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
