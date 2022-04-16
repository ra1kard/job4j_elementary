package ru.job4j.array;

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {
        int last12 = array[array.length - 1][array[array.length - 1].length - 1];
        int result = 0;
        int n = 0;
        while (result < last12) {
            n++;
            result = n * n;
        }
        int[][] arraySecond = new int[n][n];

        int countX = 0;
        int countY = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (countX < n && countY < n) {
                    arraySecond[countX][countY] = array[i][j];
                    countY++;
                } else if (countX < n && countY == n) {
                    countX++;
                    countY = 0;
                    arraySecond[countX][countY] = array[i][j];
                    countY++;
                } else if (countX == n) {
                    break;
                }
            }
        }

        for (int i = 0; i < arraySecond.length; i++) {
            for (int j = 0; j < arraySecond[i].length; j++) {
                System.out.print(arraySecond[i][j] + " ");
            }
            System.out.println();
        }

        return arraySecond;
    }

}
