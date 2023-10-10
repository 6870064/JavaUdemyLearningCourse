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
                throw new WrongLoginExeption("Login is wrong");
            }

            //Проверяем password
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwords do not match");
            }
            if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongPasswordException();
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}






// https://github.com/petrykin/homeworks/tree/master
// https://znanija.com/task/52756508