package ru.job4j.loop;

public class PrintNToM {

    public static void out(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        out(3, 5);
    }

}
