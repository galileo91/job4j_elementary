package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int inFirst = 1;
        int inSecond = 4;
        int inThird = 2;
        int expected = 4;
        int out = MultiMax.max(1, 4, 2);
        Assert.assertEquals(expected, out);
/*        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));*/
    }
}