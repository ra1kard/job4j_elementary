package ru.job4j.array;

public class SumOfDifferences {

    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                sum += nums[i] - nums[i + 1];
            }
        }
        return sum;
    }

}
