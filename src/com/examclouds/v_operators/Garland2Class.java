package com.examclouds.v_operators;

import java.util.Scanner;

public class Garland2Class {
    public static void main(String[] args) {

        int garland = 2147483640;
        int mode = getMode();
        switch (mode) {
            case 1:
                blink(garland);
                break;
            case 2:
                isFirstLampOn(garland);
                break;
            case 3:
                run(garland);
                break;
            case 4:
                print(garland);
                break;
            default:
                System.out.println("Введите числа в диапазоне [1:4]");
        }
    }

    private static int getMode(){
        System.out.println("Введите число:\n1 - для переключение в режим мигания,\n" +
                "2 - для проверки включена ли первая лампочка,\n" +
                "3 - для режима бегущей строки,\n" +
                "4 - для вывода состояния гирлянды на консоль.");
        Scanner scanner = new Scanner(System.in);
        int mode = 0;
       if (scanner.hasNextInt()) {
           mode = scanner.nextInt();
       } else {
           System.out.println("Введите числа в диапазоне [1:4]");
           System.exit(1);
       }
       return mode;
    }

    /**
     * Мигание лампочек
     *
     * @param state состояние гирлянды
     * @return новое состояние гирлянды
     */
    public static void blink(int state) {
        System.out.println("Мигание.");
        for (int i = 0; i < 10; i++) {
            print(~state);
            state = ~state;
        }
    }

    /**
     * Бегущая строка
     *
     * @param state состояние гирлянды
     * @return новое состояние гирлянды
     */
    public static int run(int state) {
        state = state << 1;
        return state;
    }

    /**
     * Метод проверяет включена ли лампочка
     *
     * @param state состояние гирлянды
     * @return возвращает true, если первая лампочка включена
     */

    public static boolean isFirstLampOn(int state) {
        int result = state & 1;
        return result == 1;
    }

    /**
     * Вывод состояния гирлянды на консоль.
     *
     * @param state состояние гирлянды
     */
    public static void print(int state) {
        System.out.println(Integer.toBinaryString(state));
    }
}
