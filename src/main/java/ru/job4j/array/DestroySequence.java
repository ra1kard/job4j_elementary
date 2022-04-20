package ru.job4j.array;

public class DestroySequence {

    public static char[] destroy(char[] seq) {
        for (int i = 0; i < seq.length; i++) {
            if (i < 5) {
                seq[i] = '0';
            } else if (i > seq.length - 6) {
                seq[i] = '1';
            }
        }
        return seq;
    }

}
