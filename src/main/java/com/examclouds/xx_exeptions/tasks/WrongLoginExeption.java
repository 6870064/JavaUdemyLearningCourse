package com.examclouds.xx_exeptions.tasks;

public class WrongLoginExeption extends Exception {
    public WrongLoginExeption(String message) {
        super(message);
    }
}
