package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
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
    }
}