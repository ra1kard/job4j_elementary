package ru.job4j.array;

public class NoConsecutive {

    public static int find(int[] data) {
        int result = -1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] - data[i - 1] != 1) {
                result = data[i];
            }
        }
        return result;
    }

}
