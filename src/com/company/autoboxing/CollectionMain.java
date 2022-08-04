package com.company.autoboxing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionMain {
    public static void main(String[] args) {
     List<String> list = new LinkedList<>();
    list.add("1");
    list.add("Test list");

        System.out.println(list);

        for (int i = 0; i <list.size();i++){
            String s = (String) list.get(i);
        }

    List <Integer> list1 = new LinkedList<>();
        list1.add(Integer.valueOf(23));


        Integer integ = 56;
        int n = integ.intValue();
        Double doub = 56.567;
        double d = doub;

        String[] colors = {"yellow", "green", "blue"};

        LinkedList <String> ll = new LinkedList<>(Arrays.asList(colors));
        ll.add("black");

        colors = ll.toArray(new String[ll.size()]);

        for (int i =0; i<colors.length;i++){
            System.out.println(colors[i]);
        }
    }
}
