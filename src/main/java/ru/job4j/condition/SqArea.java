package ru.job4j.condition;

public class SqArea {

    /**
     * 1. Допишите метод square, используя три формулы для h, l и s.
     * h = p / (2 * (k + 1));
     * l = h * k;
     * s = l * h;
     */
    public static int square(int p, int k) {
        int h = p / (2 * (k + 1));
        int w = h * k;
        int s = w * h;
        return s;
    }

    /**
     * 2. Доработайте метод main с демонстрацией работы программы с параметрами p = 6, k = 2, площадь должна быть 2.
     */
    public static void main(String[] args) {
        int result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        int result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        int result3 = SqArea.square(5, 3);
        System.out.println(" p = 5, k = 3, s = 1.17, real = " + result3);
    }

}
