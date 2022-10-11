package com.examclouds.ix_oop.tasks.i_phone;

public class PhoneMain {
    public static void main(String[] args) {
        Phone myPhone = new Phone(Manufacturer.APPLE, "+375295586222", "IPhone 14 Pro Max", 230);
        Phone myPhone1 = new Phone(Manufacturer.SAMSUNG, "+3752555852211", "Samsung S20+", 220);
        Phone myPhone2 = new Phone(Manufacturer.APPLE, "+375295567333", "IPhone 14 Pro", 210);

        System.out.println(myPhone);
        System.out.println(myPhone1);
        System.out.println(myPhone2);

        System.out.println(myPhone1.getNumber());
        System.out.println(myPhone1.getNumber());
        System.out.println(myPhone2.getNumber());

        Phone.receiveCall("Bill", "+375255574222");
        Phone.sendMessage("+375255574222", "+375255574222", "+375255574222");
    }
}

/*
1. Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
Изменить класс Phone в соответствии с концепцией JavaBean. Смотрите решение задачи в видео 1, видео 2, видео 3, видео 4, видео 5.
 */