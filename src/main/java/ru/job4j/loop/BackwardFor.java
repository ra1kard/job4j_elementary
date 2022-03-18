package ru.job4j.loop;

public class BackwardFor {

    public static void out(int m, int n) {
        for (int i = m; i > n; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        out(5, 2);
    }

}
