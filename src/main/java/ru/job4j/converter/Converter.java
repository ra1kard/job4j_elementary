package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;

        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = expected == outEuro;
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);

        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = expected == outDollar;
        System.out.println("140 rubles are 2 Dollars. Test result : " + passedDollar);
    }

}
