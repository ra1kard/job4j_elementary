package ru.job4j.loop;

public class DigitSum {

    /**
     * Дано число, нужно получить сумму его цифр: 123 => 1+2+3 = 6
     * */

    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        sum(1);
        sum(12);
        sum(123);
        sum(1234);
        sum(12345);
    }

}
