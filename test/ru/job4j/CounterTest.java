package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int inStart = 1;
        int inFinish = 10;
        int expected = 30;
        int out = Counter.sumByEven(inStart, inFinish);
        Assert.assertEquals(expected, out);
  /*      int rsl = Counter.sumByEven(1, 10);
        assertThat(rsl, is(expected));*/
    }

    @Test
    public void w1henSumEvenNumbersFrom3To8Then18() {
        int inStart = 3;
        int inFinish = 8;
        int expected = 18;
        int out = Counter.sumByEven(inStart, inFinish);
        Assert.assertEquals(expected, out);
  /*      int rsl = Counter.sumByEven(1, 10);
        assertThat(rsl, is(expected));*/
    }
}