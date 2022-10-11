package com.examclouds.input_output;

import java.io.File;

public class FileClass {

    private final static String FILE_NAME = "TestDoc.txt";
    private final static String CATALOG_NAME = "src/com";

    public static void main(String[] args) {

        File file = new File(FILE_NAME);
        File file1 = new File(CATALOG_NAME);

        methodOrCatalogCheck(file);
        methodOrCatalogCheck(file1);
        getCatalogInfo(file);
        getCatalogInfo(file1);

    }

    public static void methodOrCatalogCheck(File file) {
        System.out.println("Имя файла: " + file.getName());
        System.out.println("Путь к файлу: " + file.getPath());
        System.out.println("Абсолютный путь: " + file.getAbsolutePath());
        System.out.println("Родительский каталог: " + file.getParent());
        System.out.println(file.exists() ? "Файл / каталог существует." : "Файл / каталог не существует");
        System.out.println(file.canWrite() + "Файл / каталог доступен для редактирования");
        System.out.println(file.canRead() + "Файл / каталог доступен для чтения");
        System.out.println(file.isDirectory() ? "Каталог." : "Не каталог.");
        System.out.println(file.isFile() ? "Файл" : "Не файл");
        System.out.println(file.isAbsolute() ? "Абсолютный путь" : "Не абсолютный путь");
        System.out.println("Дата последнего редактирования: " + file.lastModified());
        System.out.println("Размер: " + file.length() + " байт.");
    }

    public static void getCatalogInfo(File catalog) {
        if (catalog.isDirectory()) {
            System.out.println("Папка " + catalog.getName());
            String[] list = catalog.list();
            if (list != null) {
                for (String fileName : list) {
                    File file = new File(catalog.getName() + "/" + fileName);
                    if (file.isDirectory()) {
                        System.out.printf("\t%s каталог%n", fileName);
                    } else {
                        System.out.printf("\t%s файл%n", fileName);
                    }
                }
            } else {
                System.out.println(catalog.getName() + " не является каталогом");
            }
        }
    }

}
