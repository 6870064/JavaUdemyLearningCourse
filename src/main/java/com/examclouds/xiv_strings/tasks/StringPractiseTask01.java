package com.examclouds.xiv_strings.tasks;

public class StringPractiseTask01 {
    public static void main(String[] args) {
        String str1 = "I like Java!";
        String str2 = "I don't like drugs";
        String str3 = "I LIKE PROGRAMMING USING JAVA";
        String subString = "!!!";
        String subString2 = "drugs";
        String subString3 = "I like";
        String subString4 = "I dont like";
        String subString5 = "Java";
        char char1 = 'a';
        char char2 = 'o';

        workWithString(str1);
        workWithString(str2);
        checkEndOfString(str1, subString);
        checkEndOfString(str2, subString2);
        checkStartWithSubString(str1, subString3);
        checkStartWithSubString(str2, subString4);
        checkStartWithSubString(str1, subString);
        checkContainSubstring(str2, subString2);
        checkPositionSubstring(str1, subString);
        checkPositionSubstring(str1, subString2);
        checkPositionSubstring(str1, subString3);
        checkPositionSubstring(str1, subString5);
        replaceSymbolsInString(str1, char1, char2);
        replaceToUpperCaseString(str1);
        replaceToLowerCaseString(str3);
        removeSubstring(str1, 7, 11);

    }

    public static void workWithString(String string) {
        System.out.println(string.charAt(string.length()-1));
    }

    public static void checkEndOfString(String string, String string2) {
        System.out.println(string.endsWith(string2));
    }

    public static void checkStartWithSubString(String string, String substring) {
        System.out.println(string.startsWith(substring));
    }

    public static void checkContainSubstring(String string, String substring) {
        System.out.println(string.contains(substring));
    }

    public static void checkPositionSubstring(String string, String substring) {
        System.out.println(string.indexOf(substring));
    }

    public static void replaceSymbolsInString(String string, char oldChar, char newChar) {
        System.out.println(string.replace(oldChar, newChar));
    }

    public static void replaceToUpperCaseString(String string) {
        System.out.println(string.toUpperCase());
    }

    public static void replaceToLowerCaseString(String string) {
        System.out.println(string.toLowerCase());
    }

    public static void removeSubstring(String string, int a, int b) {
        System.out.println(string.substring(a, b));
    }
}
