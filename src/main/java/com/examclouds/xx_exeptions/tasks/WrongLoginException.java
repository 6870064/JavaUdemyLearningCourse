package com.examclouds.xx_exeptions.tasks;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginExeption{}";
    }
}
