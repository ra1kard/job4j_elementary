package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifferenceAndDivide(double first, double second) {
        return difference(first, second)
                + divide(first, second);
    }

    public static double sumAllOperationMathFunction(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма двух операций - сложения и умножения двух чисел: " + sumAndMultiply(10, 20));
        System.out.println("Сумма двух операций - разности и деления двух чисел: " + sumDifferenceAndDivide(10, 20));
        System.out.println("Сумма четырех операций -  сложения, умножения, разности, деления двух чисел: "
                + sumAllOperationMathFunction(10, 20));
    }

}
