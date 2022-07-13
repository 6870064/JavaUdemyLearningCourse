package com.examclouds.OOPTasks.LibraryReadersTask;

import com.examclouds.OOPTasks.LibraryReadersTask.enums.Faculty;

public class LibraryReaderMain {
    public static void main(String[] args) {

        Reader reader = new Reader("Ivanov I.I", 113453, Faculty.BACHELORY, "12.05.19995", "+375295587345");
        Reader reader1 = new Reader("Petrov A.L.", 114567, Faculty.LAW, "25.06.1992", "+3753355544332");
        Reader reader2 = new Reader("Sidorov K.M.", 112433, Faculty.BANKING, "26.05.1999", "+375294499999");

        Book book = new Book("Буковски Чарльз", "Женщины");
        Book book1 = new Book("Буковски Чарльз", "Почтамп");
        Book book2 = new Book("Андрей Рощин", "Страна утраченной эмпатии");
        Book book3 = new Book("Эрих Фромм", "Искусство любить");

        Book[] books = {book, book1, book2, book3};
        Reader[] readers = {reader, reader1, reader2};

        reader.takeBook(3);
        reader.takeBook(book, book1, book2, book3);
        reader.takeBook("Горе от ума", "Преступление и наказание", "Думай и богатей", "Анатомия заблуждений");
        reader.returnBook(2);
        reader.returnBook("OSHO", "Пустышка", "Цифровой минимализм");
        reader.returnBook(book, book1, book3, book2);

        printBooks(books);
        printReaders(readers);
    }


    private static void printBooks(Book[] books) {
        System.out.println("List of the books: ");
        for (Book book : books) {
            System.out.println(book.getBookTitle());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("List of readers: ");
        for (Reader reader : readers) {
            System.out.println(reader.getFullName());
        }
        System.out.println();
    }
}

/*

3. Читатели библиотеки
Определить класс Reader, хранящий такую информацию о пользователе библиотеки:

ФИО,
номер читательского билета,
факультет,
дата рождения,
телефон.
Методы takeBook(), returnBook().
Разработать программу, в которой создается массив объектов данного класса.
Перегрузить методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги"
 */