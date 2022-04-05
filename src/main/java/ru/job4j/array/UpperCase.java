package ru.job4j.array;

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

    public static void main(String[] args) {
        char[] input = "alpha-123".toCharArray();
        UpperCase.toUpperCase(input);
    }

}
