package ru.job4j.array;

public class RightDiagonal {

    public static int[] diagonal(int[][] data) {
        int[] array = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == data.length - 1 - i) {
                    array[i] = data[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        RightDiagonal.diagonal(data);
    }

}
