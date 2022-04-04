package ru.job4j.array;

public class SwapRows {

    public static void swap(int[][] data, int src, int dst) {
        int[] temp = new int[data[src].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == src) {
                    temp[j] = data[i][j];
                } else if (i == dst) {
                   data[src][j] = data[i][j];
                   data[i][j] = temp[j];
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
                {4, 5, 6}
        };
        SwapRows.swap(data, 0, 1);
    }

}
