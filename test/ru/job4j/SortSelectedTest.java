package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(result, expect);
        //assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {5, 3, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 5};
        Assert.assertArrayEquals(result, expect);
        //assertThat(result, is(expect));
    }
}