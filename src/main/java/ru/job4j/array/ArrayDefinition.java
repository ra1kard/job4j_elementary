package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Stanislav Ivanov";
        names[1] = "Sergey Petrov";
        names[2] = "Ivan Rogov";
        names[3] = "Petr Arsentev";

        System.out.println("Размер массива names равен: " + names.length);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }

}
