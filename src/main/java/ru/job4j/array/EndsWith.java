package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (word[word.length - 1 - index] == post[post.length - 1 - index]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

}
