package com.javcode.arrays;

import java.security.SecureRandom;

public class Dies {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] freqeuency = new int[7];

        for (int i = 0; i < 1000; i++) {
            ++freqeuency[1 + random.nextInt(6)];
        }

//        for (int i = 1; i < freqeuency.length; i++) {
//            System.out.println("Side " + i + " : " + freqeuency[i]);
//        }

        for (int i : freqeuency) {
            System.out.println("Side "+i);
        }

        multidimArrayLouncher();
        arrayLauncher();
    }

    private static void multidimArrayLouncher() {
        int[][] arr = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void arrayLauncher() {
        int[][] b = new int[3][3];
        int[][] c = new int[2][];
        c[0] = new int[2];
        c[1] = new int[4];
    }
}
