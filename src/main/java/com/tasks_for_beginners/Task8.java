package com.tasks_for_beginners;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {

        //Создаем и заполняем словарь имен и возрастов
        Map<String, Integer> dictionary = new HashMap<>();
        dictionary.put("Анна", 25);
        dictionary.put("Петр", 32);
        dictionary.put("Мария", 18);
        dictionary.put("Иван", 40);
        dictionary.put("Елена", 28);

        toSortMapAsc(dictionary);
        toSortMapDesc(dictionary);
    }


    //Метод, сортирующий словарь по значению (возрастанию)
    public static void toSortMapAsc(Map map) {
        List<Map.Entry<String, Integer>> sortedAscending = new ArrayList<>(map.entrySet());
        Collections.sort(sortedAscending, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //Вывод отсортированного словаря (по возрастанию)
        System.out.println("Словарь, отсортированный по возрастанию");
        for (Map.Entry<String, Integer> entry : sortedAscending) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    //Метод, сортирующий словарь по значению (убыванию)
    public static void toSortMapDesc(Map map) {
        List<Map.Entry<String, Integer>> sortedDescending = new ArrayList<>(map.entrySet());
        Collections.sort(sortedDescending, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        //Вывод отсортированного словаря (по убыванию)
        System.out.println("Словарь, отсортированный по убыванию");
        for (Map.Entry<String, Integer> entry : sortedDescending) {
            System.out.println(entry.getKey() + ": " +entry.getValue());
        }
    }
}

// Задача 8. Отсортируйте словарь по значению в порядке возрастания и убывания. Объясните решение.