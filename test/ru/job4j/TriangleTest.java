package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {

        double inAb = 2.0;
        double inAc = 2.0;
        double inBc = 2.0;
        boolean expected = true;
        boolean out = Triangle.exist(inAb, inAc, inBc);

        Assert.assertEquals(out, expected);

    }

    @Test
    public void noWhenExist() {

        double inAb = 7.0;
        double inAc = 2.0;
        double inBc = 9.0;
        boolean expected = false;
        boolean out = Triangle.exist(inAb, inAc, inBc);

        Assert.assertEquals(out, expected);

    }
}