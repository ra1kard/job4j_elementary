package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslIndex = 0;
        int i = 0;
        int j = 0;
        while (i < left.length || j < right.length) {
            if (i == left.length) {
                rsl[rslIndex] = right[j];
                j++;
            } else if (j == right.length) {
                rsl[rslIndex] = left[i];
                i++;
            } else if (left[i] < right[j]) {
                rsl[rslIndex] = left[i];
                i++;
            } else if (right[j] < left[i]) {
                rsl[rslIndex] = right[j];
                j++;
            } else if (right[j] == left[i]) {
                rsl[rslIndex] = left[i];
                rslIndex++;
                rsl[rslIndex] = right[j];
                i++;
                j++;
            }
            rslIndex++;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
