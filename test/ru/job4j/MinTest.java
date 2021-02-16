package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        Assert.assertEquals(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                0
        );
    }

    @Test
    public void whenLastMin() {
        Assert.assertEquals(
                Min.findMin(
                        new int[] {10, 5, 3}
                ),
                3
        );
    }

    @Test
    public void whenMiddleMin() {
        Assert.assertEquals(
                Min.findMin(
                        new int[] {10, 2, 5}
                ),
                2
        );
    }
}