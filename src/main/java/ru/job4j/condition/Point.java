package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int stepOne = (x2 - x1);
        int stepTwo = (y2 - y1);
        double stepThree = Math.pow(stepOne, 2);
        double stepFour = Math.pow(stepTwo, 2);
        double stepFive = stepThree + stepFour;
        return Math.sqrt(stepFive);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);

        double resultTwo = Point.distance(0, 0, 3, 0);
        System.out.println("resultTwo (2, 2) to (2, 2) " + resultTwo);

        double resultThree = Point.distance(0, 0, 4, 4);
        System.out.println("resultTwo (2, 2) to (2, 2) " + resultThree);
    }

}
