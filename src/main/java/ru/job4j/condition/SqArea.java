package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        /**
         * 1. Допишите метод square, используя три формулы для h, l и s.
         * h = p / (2 * (k + 1));
         * l = h * k;
         * s = l * h;
         */
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);

        /**
         * 2. Доработайте метод main с демонстрацией работы программы с параметрами p = 6, k = 2, площадь должна быть 2.
         */
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }

}
