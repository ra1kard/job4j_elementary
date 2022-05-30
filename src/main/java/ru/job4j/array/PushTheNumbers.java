package ru.job4j.array;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {
        if (row != 0) {
            int i = 0;
            int j = column;
            while (i < row) {
                array[i][j] = array[i + 1][j];
                i++;
            }
        }
        if (column != 0) {
            int i = row;
            int j = 0;
            while (j < column) {
                array[i][j] = array[i][j + 1];
                j++;
            }
        }
        if (column < array[row].length - 1) {
            int i = row;
            int j = array.length - 1;
            while (j > column) {
                array[i][j] = array[i][j - 1];
                j--;
            }
        }
        if (row < array[row].length - 1) {
            int i = array.length - 1;
            int j = column;
            while (i > row) {
                array[i][j] = array[i - 1][j];
                i--;
            }
        }
        array[row][column] = 0;
    }

}
