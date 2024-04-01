package com.examclouds;

import java.util.HashMap;

public class Map<S, D extends Number> {
    public static void main(String[] args) {
        HashMap<Integer, String> idAndNames = new HashMap<>();
        idAndNames.put(1, "Piotr");
        idAndNames.put(2, "Seg");
        idAndNames.put(3, "David");
        idAndNames.put(3, "Andrey");
        idAndNames.put(4, "Andrey");

        System.out.println(idAndNames);

    }
}
