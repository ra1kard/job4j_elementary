package ru.job4j.condition;

public class LogicAnd {

    public static boolean check(int num) {
        return (num > 0) && (num % 2 == 0);
    }

}
