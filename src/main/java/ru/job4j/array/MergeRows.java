package ru.job4j.array;

public class MergeRows {

    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[count] = data[i][j];
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        MergeRows.merge(input);
    }

}
