package com.examclouds.xiv_strings.tasks;

public class StringBuilderTask02 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;

       StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(a).append(" + ").append(b).append(" = ").append(a+b).toString());
        stringBuilder.delete(0, 11);
        System.out.println(stringBuilder.append(a).append(" - ").append(b).append(" = ").append(a-b).toString());
        stringBuilder.delete(0, 12);
        System.out.println(stringBuilder.append(a).append(" * ").append(b).append(" = ").append(a * b).toString());

        System.out.println(stringBuilder.deleteCharAt(7));
        System.out.println(stringBuilder.insert(7, "равно"));
        System.out.println(stringBuilder.replace(7, 12, "="));
        System.out.println(stringBuilder.replace(7,8, "равно"));
    }
}



/*
Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */