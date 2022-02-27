package ru.job4j.condition;

public class MathAbsUsage {

    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int rsl = j - i;
        System.out.println("Разность чисел равна: " + rsl);
        int abs = Math.abs(rsl);
        System.out.println("Абсолютное значение разности чисел равно: " + abs);

        int x = 5;
        int y = 3;
        int result = x - y;
        System.out.println();
        System.out.println("Разность чисел равна: " + result);
        result = absOpposite(result);
        System.out.println("Абсолютное значение разности чисел равно: " + result);
    }

    /*как сделать из отрицательного положительное (закомментирован, т.к. такой метод есть уже, проверял как наоборот)
    public static int abs(int a) {
        return (a < 0) ? -a : a;
    }*/

    //как сделать из положительного отрицательное
    public static int absOpposite(int a) {
        return (a < 0) ? a : -a;
    }

}
