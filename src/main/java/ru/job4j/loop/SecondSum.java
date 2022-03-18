package ru.job4j.loop;

public class SecondSum {

    public static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            result = result + i;
            i++;
        }
        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        sum(1, 5);
    }

}
