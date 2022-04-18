package ru.job4j.array;

public class WordsToText {

    public static String convert(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if (i != words.length - 1) {
                result += " ";
            }
        }
        return result;
    }

}
