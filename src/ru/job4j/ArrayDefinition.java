package ru.job4j;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages: " + ages.length);

        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames: " + surnames.length);

        float[] prices = new float[40];
        System.out.println("Размер массива prices: " + prices.length);

    }
}