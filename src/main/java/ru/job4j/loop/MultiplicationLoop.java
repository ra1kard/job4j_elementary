package ru.job4j.loop;

public class MultiplicationLoop {

    public static int mult(int a, int b) {
        int result = 0;
        for (int i = a; i < b; i++) {
            if (a == 0) {
                result = 0;
                break;
            }
            result = i * b;
            System.out.println(result);
        }
        System.out.println("result = " + result);
        return result;
    }

    public static void main(String[] args) {
        mult(0, 2);
    }

}
