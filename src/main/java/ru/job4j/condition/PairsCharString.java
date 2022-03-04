package ru.job4j.condition;

public class PairsCharString {

    public static boolean check(String l, String r) {
        if (l == "" && r == "") {
            return true;
        }
        boolean value = l.charAt(0) == r.charAt((r.length() - 1)) && l.charAt((l.length() - 1)) == r.charAt(0);
        return value;
    }

    public static void main(String[] args) {
        check("sparkling", "groups");
    }

}
