package com.examclouds.InputOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterSecondDemo {
    public static void main(String[] args) {
        String s1 = "Первая строка";
        String s2 = "Вторая строка";

        try (PrintWriter printWriter = new PrintWriter("printWriter.txt")){
                printWriter.println(s1);
                int i = 2;
                printWriter.printf("Квадрат числа %d равен %d %n", i, i * i);
                printWriter.write(s2);
                printWriter.write("\nEnd of the line");
                System.out.println("Запись в файл произведена");

        } catch (IOException e) {
        System.out.println(e.getMessage());
        }
    }
}
