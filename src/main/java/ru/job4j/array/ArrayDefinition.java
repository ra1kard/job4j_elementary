package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Stanislav Ivanov";
        names[1] = "Sergey Petrov";
        names[2] = "Ivan Rogov";
        names[3] = "Petr Arsentev";
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }

}
