package com.examclouds.xiii_wrappers_classes;

public class WrapperValueOf {

    public static void main(String[] args) {
        Integer integer1 = Integer.valueOf("6");
        Integer integer2 = Integer.valueOf(6);
        Integer integer3 = Integer.valueOf("101011", 2);

        Integer[] myInteger = {integer1, integer2, integer3};

        for (int i = 0; i < myInteger.length; i++) {
            System.out.println(myInteger[i]);
        }

        Long long1 = Long.valueOf("45");
        Long long2 = Long.parseLong("67");
        Long long3 = Long.parseLong("101010", 2);

        Long[] myLong = {long1, long2, long3};

        for (int i = 0; i < myLong.length; i++) {
            System.out.println(myLong[i]);
        }
    }
}
