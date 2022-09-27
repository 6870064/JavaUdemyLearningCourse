package com.examclouds.vii_algoritms.tasks;

public class BubbleSortTask {
    public static void main(String[] args) {
        int[] myArray = arrayGenerator(12);

    }

    public static int[] arrayGenerator(int size){
        int[] myArray = new int[size];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = randomGenerator();
            System.out.print(myArray[i]+ " ");
        }
        return myArray;
    }

    public static int randomGenerator(){
        return (int) (Math.random() * 100);
    }
}
