package com.examclouds.v_operators.training;

public class SysExit {
    public static void main(String[] args) {
        System.out.println("До возврата");
        method(true);
        System.out.println("Этот операторв не будет выполняться");
    }

    public static void method(boolean flag){
        if(flag){
            System.exit(0);
        }
        System.out.println("Этот оператор не будет выполняться");
    }
}
