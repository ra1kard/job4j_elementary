package ru.job4j.array;

public class MaxLengthSeria {

    public static int find(int[] array) {
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                count++;
            } else if (array[i - 1] > array[i]) {
                count = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxLengthSeria.find(new int[] {1});
    }

}
