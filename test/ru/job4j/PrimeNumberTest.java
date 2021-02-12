package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int in = 5;
        int expected = 3;
        int out = PrimeNumber.calc(in);
        Assert.assertEquals(expected, out);
 /*       int count = PrimeNumber.calc(5);
        assertThat(count, is(3));*/
    }

    @Test
    public void when11() {
        int in = 11;
        int expected = 5;
        int out = PrimeNumber.calc(in);
        Assert.assertEquals(expected, out);
/*        int count = PrimeNumber.calc(11);
        assertThat(count, is(5));*/
    }

    @Test
    public void when2() {
        int in = 2;
        int expected = 1;
        int out = PrimeNumber.calc(in);
        Assert.assertEquals(expected, out);
/*        int count = PrimeNumber.calc(2);
        assertThat(count, is(1));*/
    }
}