package ru.job4j.array;

public class SplitExample {

    public static void main(String[] args) {
        String str = "I love Java";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        String str2 = "Красный, оранжевый, желтый";
        String[] words2 = str2.split(", ");
        for (String word : words2) {
            System.out.println(word);
        }
    }

}
