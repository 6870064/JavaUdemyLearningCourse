package com.examclouds.x_static_vars.tasks.phone_class_task;

import com.examclouds.x_static_vars.tasks.phone_class_task.enums.Vendor;

public class PhoneTask {
    public static void main(String[] args) {

        Phone phone = new Phone("+375295554222", Vendor.APPLE, "Iphone 12 MAX Pro", 176);
        Phone phone1 = new Phone("+375336543222", Vendor.SAMSUNG, "Galaxy S22 Ultra", 180);
        Phone phone2 = new Phone("+375293334111", Vendor.GOOGLE, "Pixel 6", 165);

        System.out.println(phone);
        System.out.println(phone1);
        System.out.println(phone2);
        phone.receiveCall("Mike");
        phone1.receiveCall("Serg");
        phone2.receiveCall("Vasya");
        phone.receiveCall("Vasya", "+375254436555");
        System.out.println(phone.getModel() + " has phone number " + phone.getNumber());
        System.out.println(phone1.getModel() + " has phone number " + phone1.getNumber());
        System.out.println(phone2.getModel() + " has phone number " + phone2.getNumber());
        phone.sendMessage("+375295567222", "+375295543221", "+375453321456");
    }
}
