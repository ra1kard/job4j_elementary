package ru.job4j.condition;

public class BonusCupCoffee {

    public static int countCup(int count, int n) {

        int cupOfCoffee = 0;

        if (count >= n) {
            int value = count / n;
            cupOfCoffee += value;
        }

        System.out.println(cupOfCoffee + count);
        return cupOfCoffee + count;
    }

    public static void main(String[] args) {
        countCup(7, 6);
        countCup(213, 6);
    }

}
