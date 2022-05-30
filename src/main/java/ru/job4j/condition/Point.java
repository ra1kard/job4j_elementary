package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double resultTwo = Point.distance(0, 0, 3, 0);
        System.out.println("resultTwo (0, 0) to (3, 0) " + resultTwo);
        double resultThree = Point.distance(0, 0, 4, 4);
        System.out.println("resultTwo (0, 0) to (4, 4) " + resultThree);
        double resultFour = Point.distance(0, 0, 5, 1);
        System.out.println("resultTwo (0, 0) to (5, 1) " + resultFour);
    }

}
