package ru.job4j.array;

public class TwoSquareArrays {

    public static int[] collectArray(int[][] left, int[][] right) {
        int[] result = new int[left.length * left.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                result[count] = Math.max(left[i][j], right[i][j]);
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] left = {{1, 10, 55}, {16, 32, 40}, {4, 27, 7}};
        int[][] right = {{2, 4, 92}, {82, 15, 26}, {8, 17, 35}};
        int[] rsl = TwoSquareArrays.collectArray(left, right);
    }

}
