package com.examclouds.xx_exeptions.tasks;

public class LoginPasswordCheck {

    public static void main(String[] args) {
        checkLoginResult("my_login123", "my_password123", "my_password123");
    }

    public static boolean checkLoginResult(String login, String password, String confirmPassword) {
        boolean result = checkLoginAndPassword(login, password, confirmPassword);

        if (result) {
            System.out.println("Login and password are correct");
        } else {
            System.out.println("Login and password are wrong");
        }
        return result;
    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {

        try {
            //Проверяем login
            if (!login.matches("^[a-aA-AZ0-9_]{1,20}$")) {
                throw new WrongLoginException("Login is wrong");
            }

            //Проверяем password
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwords do not match");
            }
            if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongPasswordException("Passwords do not match");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}


/*
Исключения. Задания
1. Проверка логина и пароля
Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Login должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
Обработка исключений проводится внутри метода.
Используем multi-catch block.
Метод возвращает true, если значения верны или false в другом случае.
 */


// https://github.com/petrykin/homeworks/tree/master
// https://znanija.com/task/52756508