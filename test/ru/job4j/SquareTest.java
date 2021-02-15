package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int in = 3;
        int[] expected = new int[] {0, 1, 4};
        int[] out = Square.calculate(in);
        Assert.assertThat(out, expected);
/*        int bound = 3;
        int[] rst = Square.calculate(bound);
        int[] expect = new int[] {0, 1, 4};
        assertThat(rst, is(expect));*/
    }
}