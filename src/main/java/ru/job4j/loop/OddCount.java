package ru.job4j.loop;

public class OddCount {

    public static int count(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                result++;
            }
        }
        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        count(1, 4);
    }

}
