package ru.job4j.array;

import java.util.Arrays;

public class OrArray {

    /**
     *  Собираешь из двух один, потом одинаковые удаляешь, потом сортируешь
     * */
    public static int[] or(int[] left, int[] right) {
        int[] resultLeftRight = new int[left.length + right.length];
        int count = 0;
        int countWithoutNull = 0;
        for (int i = 0; i < left.length; i++) {
            resultLeftRight[count] = left[i];
            count++;
        }
        for (int i = 0; i < right.length; i++) {
            resultLeftRight[count] = right[i];
            count++;
        }
        for (int i = 0; i < resultLeftRight.length; i++) {
            for (int j = 0; j < resultLeftRight.length; j++) {
                if (j < i && resultLeftRight[i] == resultLeftRight[j]) {
                    resultLeftRight[j] = 0;
                } else if (j > i && resultLeftRight[i] == resultLeftRight[j]) {
                    resultLeftRight[j] = 0;
                }
            }
        }
        for (int i = 0; i < resultLeftRight.length; i++) {
            if (resultLeftRight[i] != 0) {
                countWithoutNull++;
            }
        }
        for (int i = 0; i < resultLeftRight.length; i++) {
            for (int j = i + 1; j < resultLeftRight.length; j++) {
                if (resultLeftRight[i] == 0 && resultLeftRight[j] != 0) {
                    resultLeftRight[i] = resultLeftRight[j];
                    resultLeftRight[j] = 0;
                }
            }
        }
        int[] result = Arrays.copyOf(resultLeftRight, countWithoutNull);
        int temp = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[j] < result[i]) {
                    temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        return result;
    }

}
