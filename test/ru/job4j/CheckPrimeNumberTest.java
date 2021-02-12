package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int in = 5;
        boolean expected = true;
        boolean out = CheckPrimeNumber.check(in);
        Assert.assertEquals(expected, out);
/*        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));*/
    }

    @Test
    public void when4() {
        int in = 4;
        boolean expected = false;
        boolean out = CheckPrimeNumber.check(in);
        Assert.assertEquals(expected, out);
/*        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));*/
    }

    @Test
    public void when1() {
        int in = 1;
        boolean expected = false;
        boolean out = CheckPrimeNumber.check(in);
        Assert.assertEquals(expected, out);
/*        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));*/
    }
}