package com.examclouds.InputOutput;

import java.io.*;

public class FileInputOutputStreamDemo {

    private static final String FILE_NAME = "a.txt";
    public static void main(String[] args) {
        try {
            char [] symbols = {'a', 'b', 'c'};
            OutputStream output = new FileOutputStream(FILE_NAME);
            for (int i = 0; i < symbols.length; i++){
                // Запись каждого символа в текстовый файл
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
