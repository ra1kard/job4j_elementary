package ru.job4j.array;

public class Validator {

    public static boolean checkArray(int[] data, int value) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) {
                count++;
            }
        }
        return count <= (data.length / 2);
    }

}