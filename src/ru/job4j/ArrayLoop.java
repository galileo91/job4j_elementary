package ru.job4j;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 2 + 3;
        }
    }
}
