package com.examclouds.input_output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    final static String INPUT_FILE_NAME = "TestInputDoc.txt";
    final static String OUTPUT_FILE_NAME = "TestOutputDoc.txt";

    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = null;
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream(INPUT_FILE_NAME);
            fileOut = new FileOutputStream(OUTPUT_FILE_NAME);

            int a;
            while ((a = fileIn.read()) != -1){
                fileOut.write(a);
            }
        } finally {
            if (fileIn !=null) {
                fileIn.close();
            } if (fileOut !=null) {
                fileOut.close();
            }
        }
    }
}
