package ru.job4j.array;

public class NumberToArray {

    public static int[] resolve(int number) {
        int count = 0;
        String str = String.valueOf(number);
        for (char element : str.toCharArray()) {
            count++;
        }

        String[] result = new String[count];
        for (int i = 0; i < result.length; i++) {
            char ch = str.charAt(str.length() - 1 - i);
            result[i] = String.valueOf(ch);
        }

        int[] result2 = new int[count];
        for (int i = 0; i < result.length; i++) {
            result2[i] = Integer.parseInt(result[i]);
        }

        return result2;
    }

}
