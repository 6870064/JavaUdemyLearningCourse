package com.examclouds_2024.xix_collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<String, Double>();

        hashMap.put("Ivanov", 3434.34);
        hashMap.put("Petrov", 123.70);
        hashMap.put("Sidorov", 1378.00);

        Set<String> keys = hashMap.keySet();

        for (String key : keys) {
            System.out.print(key + ": ");
            System.out.println(hashMap.get(key));
        }



    }
}
