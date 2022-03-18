package ru.job4j.loop;

public class SectionCount {

    public static int count(int length, int section) {
        int result = 0;
        while (section <= length) {
            result++;
            section = section * 2;
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        count(4, 2);
    }

}
