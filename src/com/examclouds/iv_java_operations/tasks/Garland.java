package com.examclouds.iv_java_operations.tasks;

public class Garland {
    public static void main(String[] args) {

        int garland = 46;
        print(garland);

        System.out.println(isFirstLampOn(garland));

        garland = blink(garland);
        print(garland);

        garland = run(garland);
        print(garland);
    }

    /**
     * Мигание лампочек
     *
     * @param state состояние гирлянды
     * @return новое состояние гирлянды
     */
    public static int blink(int state) {
        state = ~state;
        return state;
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
