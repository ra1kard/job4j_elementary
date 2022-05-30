package ru.job4j.array;

public class Split {

    public static char[][] split(char[] str, char c) {
        int countCharC = 1;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                countCharC++;
            }
        }
        char[][] result = new char[countCharC][];
        int[] nums = new int[countCharC];
        int x = 0;
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                nums[x] = ++count;
            } else {
                x++;
                count = 0;
            }
        }
        for (int i = 0; i < countCharC; i++) {
            result[i] = new char[nums[i]];
        }
        int countStr = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (str[countStr] == c && countStr + 1 < str.length && str[countStr + 1] != c) {
                    countStr++;
                    result[i][j] = str[countStr];
                } else if (str[countStr] != c) {
                    result[i][j] = str[countStr];
                }
                countStr++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Split.split("one two three".toCharArray(), ' ');
    }

}
