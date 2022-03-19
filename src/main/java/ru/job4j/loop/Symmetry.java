package ru.job4j.loop;

public class Symmetry {

    public static boolean check(int i) {
        Integer x = i;
        String value = x.toString();

        for (int j = 0; j < (value.length() / 2); j++) {
            if (value.charAt(j) != (value.charAt((value.length() - 1 - j)))) {
                return false;
            }
        }
        return true;
    }

}
