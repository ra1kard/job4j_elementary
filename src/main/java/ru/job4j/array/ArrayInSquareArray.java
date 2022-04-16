package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int result = 0;
        int n = 0;
        while (result < array.length) {
            n++;
            result = n * n;
        }

        int[][] arraySecond = new int[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count < array.length) {
                    arraySecond[i][j] = array[count];
                    count++;
                } else {
                    arraySecond[i][j] = 0;
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
