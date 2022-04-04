package ru.job4j.array;

public class IndexOfWithCount {

    public static int indexOf(char[] string, char c, int number) {
        int count = 1;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c && count < number) {
                count++;
            } else if (string[i] == c && count == number) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        IndexOfWithCount.indexOf(new char[] {'a', 'b', 'c', 'd', 'e', 'c'}, 'c', 2); // expected 5
    }

}
