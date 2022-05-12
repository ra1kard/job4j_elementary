package ru.job4j.array;

import java.util.Arrays;

public class SplitExample2 {

    public static char[][] split(char[] str, char c) {
        int countCharC = 1;     //посчитаем сколько пробелов, чтобы понять сколько будет строк
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                countCharC++;
            }
        }

        char[][] result = new char[countCharC][str.length];
        int i = 0;
        int j = 0;
        for (int index = 0; index < str.length; index++) {
            if (str[index] != c) {          //если не пробел, записываем в массив
                result[i][j] = str[index];
            } else {                        //если пробел переходим на новую строку массива
                i++;
                j = -1;
            }
            j++;
        }

        for (int k = 0; k < result.length; k++) {           //печать
            for (int l = 0; l < result[i].length; l++) {
                System.out.print(result[k][l]);
            }
            System.out.println();
        }

        //посчитаем длину (char не null) для первой строки у result и инициализируем длину
        int countOne = 0;
        char c1 = '\u0000';
        for (int k = 0; k < 1; k++) {
            for (int l = 0; l < result[k].length; l++) {
                if (result[k][l] != c1) {
                    countOne++;
                }
            }
        }
        System.out.println("countOne = " + countOne);

        //посчитаем длину (char не null) для второй строки у result и инициализируем длину
        int countTwo = 0;
        char c2 = '\u0000';
        for (int k = 1; k < 2; k++) {
            for (int l = 0; l < result[k].length; l++) {
                if (result[k][l] != c2) {
                    countTwo++;
                }
            }
        }
        System.out.println("countTwo = " + countTwo);

        //посчитаем длину (char не null) для третьей строки у result и инициализируем длину
        int countThree = 0;
        char c3 = '\u0000';
        for (int k = 2; k < 3; k++) {
            for (int l = 0; l < result[k].length; l++) {
                if (result[k][l] != c3) {
                    countThree++;
                }
            }
        }
        System.out.println("countThree = " + countThree);

        char[][] result2 = new char[countCharC][];
        result2[0] = new char[countOne];
        result2[1] = new char[countTwo];
        result2[2] = new char[countThree];

        for (int k = 0; k < result2.length; k++) {
            for (int l = 0; l < result2[k].length; l++) {
                result2[k][l] = result[k][l];
            }
        }

        for (int k = 0; k < result2.length; k++) {
            for (int l = 0; l < result2[k].length; l++) {
                System.out.print(result[k][l]);
            }
            System.out.println();
        }

        int commonCount = 1;
        return Arrays.copyOf(result, commonCount);
    }

    public static void main(String[] args) {
        SplitExample2.split("one two three".toCharArray(), ' ');
    }

}
