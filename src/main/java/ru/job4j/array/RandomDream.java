package ru.job4j.array;

public class RandomDream {

    public static String random(String[] prizes, int num) {
        int result;
        result = num / prizes.length;
        result = result * prizes.length;
        result = num - result;
        if (result == 0) {
            result += 4;
        }
        return prizes[result - 1];
    }

}
