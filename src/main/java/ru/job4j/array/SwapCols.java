package ru.job4j.array;

public class SwapCols {

    public static void swap(int[][] data, int src, int dst) {
        int[] temp = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == src) {
                    temp[j] = data[i][j];
                    data[i][j] = data[i][dst];
                    data[i][dst] = temp[j];
                }
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        SwapCols.swap(data, 0, 2);
    }

}
