package ru.job4j;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] nums = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Длина массива " + (i+1) + " равна: " + nums[i].length);

        }
    }
}
