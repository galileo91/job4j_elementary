package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        Assert.assertEquals(result, expect);
        //assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        Assert.assertEquals(result, expect);
        //assertThat(result, is(expect));
    }

/*    @Test
    public void whenArrayHas5Then0() {
        int[] inA = {5, 4, 3, 2};
        int inB = 5;
        int expected = 0;
        int out = FindLoop.indexOf(inA, inB);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenArrayHas5Then2() {
        int[] inA = {5, 4, 3, 2};
        int inB = 3;
        int expected = 2;
        int out = FindLoop.indexOf(inA, inB);
        Assert.assertEquals(expected, out);
    }*/
}