package com.examclouds.vi_arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Garland3Class {
    public static void main(String[] args) {
        int[] garland = initialize();
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
                System.out.println("Введите числа 1, 2, 3 или 4.");
        }
    }

    private static int getMode() {
        System.out.println("Введите число:\n1 - для переключение в режим мигания,\n" +
                "2 - для проверки включена ли первая лампочка,\n" +
                "3 - для режима бегущей строки,\n" +
                "4 - для вывода состояния гирлянды на консоль.");
        Scanner scanner = new Scanner(System.in);
        int mode = 0;
        if (scanner.hasNextInt()) {
            mode = scanner.nextInt();
        } else {
            System.out.println("Введите числа 1, 2, 3 или 4.");
            System.exit(1);
        }
        return mode;
    }

    /**
     * Мигание лампочек.
     *
     * @param state1 состояние гирлянды
     */
    public static void blink(int[] state1) {
        System.out.println("Мигание.");
        int[] state2 = getSecondState(state1);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                print(state1);
            } else {
                print(state2);
            }
        }
    }

    public static int[] getSecondState(int[] state1) {
        int[] state2 = new int[state1.length];

        for (int j = 0; j < state1.length; j++) {
            if (state1[j] == 0) {
                state2[j] = 1;
            } else {
                state2[j] = 0;
            }
        }
        return state2;
    }

    /**
     * Бегущая строка.
     *
     * @param state состояние гирлянды
     */
    public static void run(int[] state) {
        System.out.println("Бегущая строка.");
        for (int i = 0; i < 10; i++) {
            print(state);
            int first = state[0];
            System.arraycopy(state, 1, state, 0, state.length - 1);
            state[state.length - 1] = first;
        }
    }

    /**
     * Проверяет включена ли лампочка.
     *
     * @param state состояние гирлянды
     */
    public static void isFirstLampOn(int[] state) {
        print(state);
        if (state[0] == 1) {
            System.out.println("Первая лампочка включена.");
        } else {
            System.out.println("Первая лампочка выключена.");
        }
    }

    /**
     * Вывод состояния гирлянды на консоль.
     *
     * @param state состояние гирлянды
     */
    public static void print(int[] state) {
        System.out.println(Arrays.toString(state));
    }

    public static int[] initialize() {
        int[] girlyanda = new int[32];

        for (int i = 0; i < girlyanda.length; i++) {
            girlyanda[i] = (int) (Math.random() * 2);
        }
        return girlyanda;
    }
}