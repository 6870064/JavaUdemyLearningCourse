package com.examclouds.xii_interfaces_and_enums.tasks.i_interface_printable;

import static com.examclouds.xii_interfaces_and_enums.tasks.i_interface_printable.Book.printBooks;
import static com.examclouds.xii_interfaces_and_enums.tasks.i_interface_printable.Magazine.printMagazine;

public class PrintableMain {
    public static void main(String[] args) {
        Printable book = new Book("Рассказы");
        Printable book1 = new Book("Хребты безумия");
        Printable magazine = new Magazine("Forbes");
        Printable magazine1 = new Magazine("Men's Health");

        Printable[] printables = {book, book1, magazine, magazine1};
       // printPrintables(printables);
        printBooks(printables);
        printMagazine(printables);
    }

    public static void printPrintables(Printable[] printables){
        for (Printable printable : printables){
            printable.print();
        }
    }
}
