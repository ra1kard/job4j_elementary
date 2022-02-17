package ru.job4j.condition;

public class StringEq {

    public static void main(String[] args) {
        String first = new String("one");
        String one = new String("one");
        if (first.equals(one)) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equal one");
        }
    }

}
