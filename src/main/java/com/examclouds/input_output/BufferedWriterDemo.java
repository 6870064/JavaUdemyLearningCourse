package com.examclouds.input_output;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffWriter.txt"))) {
            String text = "Привет, мир!";
            bufferedWriter.write(text);
            bufferedWriter.newLine();
            bufferedWriter.write(text);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }



}
