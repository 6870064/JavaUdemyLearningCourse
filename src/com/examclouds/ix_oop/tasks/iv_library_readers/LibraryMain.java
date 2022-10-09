package com.examclouds.ix_oop.tasks.iv_library_readers;

public class LibraryMain {
    public static void main(String[] args) {
        Book book = new Book("Рассказы", "Эдгар Аллан По");
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book("Стихи", "А.С. Пушкин");

        Reader reader = new Reader("Иванов И.А.", 123, Faculty.MANAGEMENT,
                "12.05.2000","+375455584321");

        reader.takeBook(book,book1, book2, book3, book4);
    }
}
