package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
/*        int result = Max.max(1, 2);
        assertThat(result, is(2));*/
        int inA = 1;
        int inB = 2;
        int expected = 2;
        int out = Max.max(inA, inB);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int inA = 2;
        int inB = 1;
        int expected = 2;
        int out = Max.max(inA, inB);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int inA = 2;
        int inB = 2;
        int expected = 2;
        int out = Max.max(inA, inB);
        Assert.assertEquals(out, expected);
    }

}