package com.examclouds.xix_collections.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {

        HeavyBox heavyBox = new HeavyBox(3);
        HeavyBox heavyBox1 = new HeavyBox(4);
        HeavyBox heavyBox2 = new HeavyBox(5);
        HeavyBox heavyBox3 = new HeavyBox(6);
        HeavyBox heavyBox4 = new HeavyBox(7);
        HeavyBox heavyBox5 = new HeavyBox(8);
        HeavyBox heavyBox6 = new HeavyBox(9);

        List<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(heavyBox);
        arrayList.add(heavyBox1);
        arrayList.add(heavyBox2);
        arrayList.add(heavyBox3);
        arrayList.add(heavyBox4);
        arrayList.add(heavyBox5);
        arrayList.add(heavyBox6);
        arrayList.forEach(System.out::println);

        arrayList.remove(6);
        arrayList.forEach(System.out::println);

        //1 вариант
        Object[] objectArray = arrayList.toArray();
        System.out.println(Arrays.toString(objectArray));

        //2 вариант
        String[] stringArray1 = new String[arrayList.size()];
        arrayList.toArray(stringArray1);
        System.out.println(Arrays.toString(stringArray1));

        //3 вариант
        String[] stringArray2 = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray2));




        arrayList.clear();
        arrayList.forEach(System.out::println);



    }
}
