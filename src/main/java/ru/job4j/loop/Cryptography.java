package ru.job4j.loop;

public class Cryptography {

    public static String code(String s) {
        if (s == "") {
            s = "empty";
            System.out.println(s);
            return s;
        }
        StringBuilder str = new StringBuilder(s);
        str.toString();
        for (int i = 0; i < (str.length() - 4); i++) {
            if (str.length() > 0 && str.length() <= 4) {
                return str.toString();
            } else {
                str.setCharAt(i, '#');
            }
        }
        System.out.println("ответ: " + str);
        return str.toString();
    }

}
