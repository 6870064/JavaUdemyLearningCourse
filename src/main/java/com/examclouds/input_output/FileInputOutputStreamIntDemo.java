package com.examclouds.input_output;

import java.io.*;

public class FileInputOutputStreamIntDemo {

    private static final String FILE_NAME = "integer_list.txt";

    public static void main(String[] args) {
        try {
            char[] symbols = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            OutputStream output = new FileOutputStream(FILE_NAME);
            for (int i = 0; i < symbols.length; i++) {
                // Запись каждого числа в текстовый файл
                output.write(symbols[i]);
            }
            output.close();

            InputStream input = new FileInputStream(FILE_NAME);
            int size = input.available();

            for (int i = 0; i < size; i++) {
                //Чтение текстового файла посимвольно
                System.out.println((char) input.read() + " ");
            }
            input.close();

        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
