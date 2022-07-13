package com.examclouds.OOPTasks.PhoneClassTask;

import com.examclouds.OOPTasks.PhoneClassTask.enums.Vendor;

import java.util.Objects;

public class Phone {

    private String number;
    private Vendor vendor;
    private String model;
    private int weight;

    public Phone(String number, Vendor vendor, String model, int weight) {
    //Вызвать из конструктора с тремя параметрами конструктор с двумя
        this(number,model);
        this.number = number;
        this.vendor = vendor;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", vendor=" + vendor +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return weight == phone.weight && Objects.equals(number, phone.number) && vendor == phone.vendor && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, vendor, model, weight);
    }

    public void receiveCall(String callingName){
        System.out.println(callingName+" is calling");
    }

    public void receiveCall(String callingName, String callingNumber){
        System.out.println(callingName+" is calling");
    }

    //Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
    // которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    public void sendMessage(String ...array){

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
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
Изменить класс Phone в соответствии с концепцией JavaBean.
 */