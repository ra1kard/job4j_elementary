package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {

    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[2][];
        int count = 0;
        int rowOne = 0;
        int rowTwo = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up) {
                rowOne++;
            } else if (data[i] <= down) {
                rowTwo++;
            }
        }
        if (rowOne > 0 && rowTwo > 0) {
            count = 2;
        } else if (rowOne > 0 || rowTwo > 0) {
            count = 1;
        }

        if (rowOne == 1) {
            result[0] = new int[rowOne + 1];
        } else {
            result[0] = new int[rowOne];
        }

        if (rowTwo == 1) {
            result[1] = new int[rowTwo + 1];
        } else {
            result[1] = new int[rowTwo];
        }

        int countX = 0;
        int countY = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i == 0 && data[j] >= up) {
                    result[i][countX] = j;
                    countX++;
                } else if (i == 1 && data[j] <= down) {
                    result[i][countY] = j;
                    countY++;
                }
            }
        }

        if (countX == 1) {
            result[0][1] = result[0][0];
        } else if (countY == 1) {
            result[1][1] = result[1][0];
        }

        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int[] data = {5, 16, 17, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        Anomaly.found(data, up, down);
    }

}
