package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void when2on2() {
        int[][] table = Matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        Assert.assertArrayEquals(table, expect);
        //assertThat(table, is(expect));
    }
}