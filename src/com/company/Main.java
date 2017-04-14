package com.company;

public class Main {

    public static void main(String[] args) {
        char a = 9723;                         // символ белый квадрат
        char b = 9724;                         // символ черный квадрат
        int siz = 15;                          // размер доски
        char[][] arr = new char[siz][siz];     // создаем двумерный массив
        for (int i = 0; i < siz; i++) {        // цикл по первой размерности
            for (int j = 0; j < siz; j++) {    // цикл по второй размерности
                if ((j + i) % 2 == 0) {        // задаем значения элементам массива
                    arr[i][j] = a;
                } else {
                    arr[i][j] = b;
                }
            }
        }
        for (int i = 0; i < siz; i++) {         //  выводим массив на экран
            for (int j = 0; j < siz; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
