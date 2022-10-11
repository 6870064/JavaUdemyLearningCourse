package com.examclouds.v_operators.training;

public class SwitchDemoClass {
    public static void main(String[] args) {
        seasonDetermine(12);
        seasonDetermine(3);
        seasonDetermine(13);
    }


    public static void seasonDetermine(int a){
       switch (a){
           case 1:
           case 2:
           case 12:
               System.out.println("Season is Winter");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println("Season is Spring");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println("Season is Summer");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println("Season is Autumn");
               break;
           default:
               System.out.println("Only data from [1:12] is allowed");
               break;
       }
    }
}
