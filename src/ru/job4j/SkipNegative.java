package ru.job4j;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        /* loops */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
