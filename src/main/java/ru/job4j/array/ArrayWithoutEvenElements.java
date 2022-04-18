package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {

    public static int[] changeData(int[] data) {
        int[] newArray = new int[data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                newArray[count] = data[i];
                count++;
            }
        }
        return Arrays.copyOf(newArray, count);
    }

}
