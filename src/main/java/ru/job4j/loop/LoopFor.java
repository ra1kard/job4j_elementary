package ru.job4j.loop;

public class LoopFor {

    public static void main(String[] args) {
        int i;
        for (i = 5; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Индекс после цикла равен: " + i);
        System.out.println("Условие выполнения цикла равно: " + (i <= 10));
    }

}
