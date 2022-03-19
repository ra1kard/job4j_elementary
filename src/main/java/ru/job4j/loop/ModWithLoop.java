package ru.job4j.loop;

public class ModWithLoop {

    public static int mod(int n, int d) {
        while (n >= d) {
            n = n - d;
        }
        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {
        mod(4, 2);
        mod(3, 2);
        mod(8, 3);
        mod(0, 3);
    }

}
