package ru.job4j.loop;

public class Abbreviation {

    public static String collect(String s) {
        String s2 = s.toUpperCase();
        StringBuffer s3 = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) != ' ') && s.charAt(i) == s2.charAt(i)) {
                s3.append(s.charAt(i));
            }
        }
        String s4 = s3.toString();
        System.out.println(s4);
        return s4;
    }

}
