package com.examclouds.input_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWrapperDemo {
    public static void main(String[] args) {
        String s1 = "Первая строка";
        String s2 = "Вторя строка";

        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("printWriterWrapper.txt")))) {
            printWriter.println(s1);
            int i = 2;
            printWriter.printf("Квадрат числа %d %n", i, i * i);
            printWriter.write(s2);
            printWriter.write("\nEnd of the line");
            System.out.println("Запись в файл произведена");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
