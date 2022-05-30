package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {

    public static int[] collectNewArray(int[][] data, int sum) {
        int count = 0;
        int countNotNull = 1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == data[data.length - 1][data[data.length - 1].length - 1]) {
                    break;
                } else if (count == sum) {
                    data[i][j] = 0;
                    count = 0;
                } else {
                    countNotNull++;
                }
                count++;
            }
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[] newArray = new int[countNotNull];
        int countNewArray = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != 0) {
                    newArray[countNewArray] = data[i][j];
                    countNewArray++;
                }
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        return newArray;
    }

}
