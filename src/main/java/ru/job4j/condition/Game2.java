package ru.job4j.condition;

public class Game2 {

    public static int checkGame(double percent, int prize, int pay) {

        double result = percent * prize;
        if (result > pay) {
            return (int) (result - pay);
        } else if (result <= 0) {
            return 0;
        }
        return 0;

    }

}
