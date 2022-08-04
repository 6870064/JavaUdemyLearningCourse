package com.company.arrays;

public class TwoDimensionArrayTask {

    public static void main(String[] args) {

        //Количество строк m, количество столбцов n.
        int m = 4;
        int n = 4;
        //С помощью переменной s задаются числа внутри массива начиная с 1.
        int s = 1;

        //Объявляем и инициализируем массив.
        int[][] myArray = new int[m][n];

        //Заполняем периметр массива по часовой стрелке
        for (int y = 0; y < n; y++) {
            myArray[0][y] = s;
            s++;
        }
        for (int x = 1; x < m; x++) {
            myArray[x][n - 1] = s;
            s++;
        }

        for (int y = n - 2; y >= 0; y--) {
            myArray[m - 1][y] = s;
            s++;
        }

        for (int x = m - 2; x > 0; x--) {
            myArray[x][0] = s;
            s++;
        }
        //  После заполнения периметра продолжаем заполнять массив и задаем координаты ячейки, которую необходимо
        //  заполнить следующей.
        int c = 1;
        int d = 1;

        while (s < m * n) {
//В Java инициализированный интовый массив заполняется нулями. Периметр мы заполнили числами, отличными от нулей.
//Следующие циклы поочерёдно работают, заполняя ячейки. Вложенный цикл останавливается, если следующая ячейка имеет
//значение, отличное от ноля. Ячейка, на которой остановился цикл, не заполняется.

            //Движемся вправо
            while (myArray[c][d + 1] == 0) {
                myArray[c][d] = s;
                s++;
                d++;
            }

            //Движемся вниз.
            while (myArray[c + 1][d] == 0) {
                myArray[c][d] = s;
                s++;
                c++;
            }

            //Движемся влево
            while (myArray[c][d - 1] == 0) {
                myArray[c][d] = s;
                s++;
                d--;
            }

            //Движемся вверх.
            while (myArray[c - 1][d] == 0) {
                myArray[c][d] = s;
                s++;
                c--;
            }
        }

        // При данном решении в центре всегда остается незаполненная ячейка.
        // Убираем ее при помощи следующего цикла.
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (myArray[x][y] == 0) {
                    myArray[x][y] = s;
                }
            }
        }

        //Выводим массив в консоль.
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (myArray[x][y] < 10) {
                    //Два пробела, чтобы в консоли были ровные столбцы.
                    System.out.print(myArray[x][y] + " ");
                } else {
                    System.out.print(myArray[x][y] + " ");
                }
            }
            System.out.println("");
        }
    }
}

/*
Заполнить матрицу по спирали в ООП

1 2 3 4
12 13 14 5
11 16 15 6
10 9 8 7

https://renkport.ru/java/primer/zapolnenie-dvumernogo-massiva-po-spirali/
 */
