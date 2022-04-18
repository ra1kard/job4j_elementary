package ru.job4j.array;

import java.util.Arrays;

public class Initials {

    public static String convert(String[] fio) {
        char ch1 = fio[1].charAt(0);
        char ch2 = fio[2].charAt(0);
        return fio[0] + " " + ch1 + "." + ch2 + ".";
    }

}
