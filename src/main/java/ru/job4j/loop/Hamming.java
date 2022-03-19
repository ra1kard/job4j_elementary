package ru.job4j.loop;

public class Hamming {

    public static int checkStrings(String left, String right) {
        int value = left.length();
        int hamming = 0;

        for (int i = 0; i < value; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                hamming++;
            }
        }
        return hamming;
    }

    public static void main(String[] args) {
        checkStrings("2173896", "2233796");
    }

}
