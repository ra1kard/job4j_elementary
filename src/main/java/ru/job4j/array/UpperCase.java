package ru.job4j.array;

import java.util.Arrays;

public class UpperCase {

    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLetter(string[i]) && Character.isLowerCase(string[i])) {
                result[i] = Character.toUpperCase(string[i]);
            } else {
                result[i] = string[i];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        return result;
    }

    public static char[] onlyLowCase(char[] input) {
        char[] result = new char[input.length];
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (Character.isLetter(input[i]) && Character.isLowerCase(input[i])) {
                result[count] = Character.toUpperCase(input[i]);
                count++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        result = Arrays.copyOf(result, count);
        return result;
    }

    public static void main(String[] args) {
        char[] input = "aLpHa - 1".toCharArray();
        //UpperCase.toUpperCase(input);
        UpperCase.onlyLowCase(input);
    }

}
