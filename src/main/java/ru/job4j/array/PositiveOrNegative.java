package ru.job4j.array;

public class PositiveOrNegative {

    public static boolean check(int[] data) {
        int countMinus = 0;
        int countPlus = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] > 0) {
                countPlus++;
            } else if (data[i] < 0) {
                countMinus++;
            }
        }
        if (countMinus % 2 != 0) {
            return true;
        } else if (countPlus % 2 == 0) {
            return false;
        }
        return false;
    }

}
