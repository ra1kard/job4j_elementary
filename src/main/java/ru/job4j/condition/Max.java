package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean value = left > right;
        int result = value ? left : right;
        return result;
    }

}
