package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {

    public static int[] diff(int[] left, int[] right) {
        int value = 0;
        int[] result = new int[left.length + right.length];
        int countWithoutNull = 0;

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    value++;
                }
            }
            if (value == 0) {
                result[i] = left[i];
            }
            value = 0;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                countWithoutNull++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] == 0 && result[j] != 0) {
                    result[i] = result[j];
                    result[j] = 0;
                }
            }
        }

        int[] result2 = Arrays.copyOf(result, countWithoutNull);

        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();

        return result2;
    }

}
