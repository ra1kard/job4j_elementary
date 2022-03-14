package ru.job4j.loop;

public class CheckPrimeNumber {

    /**
     * В этом задании нужно проверить, что число является простым.
     * Простым считается число, которое делится только на себя и на единицу.
     *
     * Если number =  5, метод должен вернуть true, так как 5 делится только 1 и на 5.
     * Если number = 4, метод должен вернуть false, так как 4 делится на 2 и на 4.
     *
     * Вы должны использовать цикл for. Внутри цикла нужно добавить оператор if с проверкой деления на число.
     * Проверка деления без остатка выполняется оператором %.
     * */

    public static boolean check(int number) {

        boolean prime = true;

        for (int i = number; i > 1; i--) {

            if (i % (number - 1) == 0) {
                System.out.println(number + " = " + (number % i == 0));
            }

        }

        return prime;
    }

}
