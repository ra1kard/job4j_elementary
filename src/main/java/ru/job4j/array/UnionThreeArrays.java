package ru.job4j.array;

public class UnionThreeArrays {

    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] result = new int[right.length + 1];

        result[0] = left[0];
        result[result.length - 1] = left[left.length - 1];

        for (int i = 1; i < middle.length - 1; i++) {
            if (i % 2 != 0) {
                for (int j = i; j < j + 1; j++) {
                    if (j % 2 == 0) {
                        result[j] = middle[i];
                    }
                    if (j == middle.length) {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < right.length - 1; i++) {
            if (i % 2 == 0) {
                for (int j = i; j < j + 1; j++) {
                    if (j % 2 != 0) {
                        result[j] = right[i];
                    }
                    if (j == right.length) {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        return result;
    }

    public static void main(String[] args) {
        int[] left = {1, 2, 3, 4, 5};
        int[] middle = {6, 7, 8, 9, 10};
        int[] right = {11, 12, 13, 14, 15, 16};
        int[] rsl = UnionThreeArrays.union(left, middle, right);
    }

}
