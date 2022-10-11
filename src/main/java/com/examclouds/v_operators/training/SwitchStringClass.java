package com.examclouds.v_operators.training;

public class SwitchStringClass {
    public static void main(String[] args) {
        String exam = "OCPJP 7";
        switch (exam) {
            case "OCPJP 7":
                System.out.println(exam+ ": 1Z0-804");
                break;
                case "OCPJP 8":{
                    System.out.println(exam+ ": 1Z0-809");
                    break;
                }
            default:
                System.out.println(exam+ ": -----");
                break;
        }
    }
}
