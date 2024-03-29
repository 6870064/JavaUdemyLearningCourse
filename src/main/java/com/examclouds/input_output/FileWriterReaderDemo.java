package com.examclouds.input_output;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {
    public static void main(String[] args) {
        char[] array = new char[50];
        int size = 0;
        File file = new File("fileWriter.txt");
        try
            (FileWriter fw = new FileWriter(file);
             FileReader fr = new FileReader(file)) {

            fw.write("Learn\nJava!\n");
            fw.flush();
            size = fr.read(array);
            System.out.println("Кол-во прочтенных символов: " +size+ " ");
            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
