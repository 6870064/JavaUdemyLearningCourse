package com.examclouds.InputOutput;

import java.io.*;

public class FileOutputStreamDemo {

    private final static String FILE_NAME = "test_file.txt";
    private final static char[] symbols = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    public static void main(String[] args) throws IOException {

        File file = new File(FILE_NAME);
        fileWrite(file, symbols);
        fileRead(file);
    }

    public static void fileWrite(File file, char[] chars) throws IOException {
        OutputStream output = new FileOutputStream(FILE_NAME);
        for (int i = 0; i < chars.length; i++){
            //запись каждого символа в файл
            output.write(chars[i]);
        }
        output.close();
    }

    public static void fileRead(File file) throws IOException {
        InputStream input = new FileInputStream(FILE_NAME);
        int size = input.available();
        for (int i = 0 ; i < size; i++) {
            System.out.println((char) input.read() + " ");
        }
        input.close();
    }
}
