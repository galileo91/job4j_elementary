package ru.job4j;

public class Turn {
    public static int[] back(int[] array) {

        //int centr = array.length / 2 - 1;

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;

/*            if (i == centr) {
                break;
            }*/

        }
        return array;
    }
}
