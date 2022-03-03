package ru.job4j.condition;

public class WeeklySalary {

    public static int calculate(int[] hours) {

        int priceDefaultHour = 10;
        int priceOvertimeHour = 15;
        int valueMoneyAtDay;
        int valueMoneyAtWeek = 0;

        for (int i = 0; i < hours.length; i++) {
            valueMoneyAtDay = 0;
            if (hours[i] <= 8) {
                valueMoneyAtDay = valueMoneyAtDay + (hours[i] * priceDefaultHour);
            } else if (hours[i] > 8) {
                valueMoneyAtDay = valueMoneyAtDay + (8 * priceDefaultHour);
                valueMoneyAtDay = valueMoneyAtDay + ((hours[i] - 8) * priceOvertimeHour);
            }
            valueMoneyAtWeek += i >= 5 && hours[i] != 0 ? valueMoneyAtDay * 2 : valueMoneyAtDay;
        }
        System.out.println(valueMoneyAtWeek);
        return valueMoneyAtWeek;
    }

    public static void main(String[] args) {
        int[] hours = {8, 8, 8, 8, 8, 0, 0};
        calculate(hours);
    }

}
