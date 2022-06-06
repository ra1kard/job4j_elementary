package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean value = left > right;
        int result = value ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        int checkFirstSecond = max(first, second);
        return max(checkFirstSecond, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int checkFirstSecond = max(first, second);
        int checkThirdFourth = max(third, fourth);
        return max(checkFirstSecond, checkThirdFourth);
    }

}
