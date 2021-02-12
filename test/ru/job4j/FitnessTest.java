package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int inIvan = 95;
        int inNik = 90;
        int expected = 0;
        int out = Fitness.calc(inIvan, inNik);
        Assert.assertEquals(expected, out);
/*        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));*/
    }

    @Test
    public void whenIvanLessByOneNik() {
        int inIvan = 90;
        int inNik = 95;
        int expected = 1;
        int out = Fitness.calc(inIvan, inNik);
        Assert.assertEquals(expected, out);
/*        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));*/
    }

    @Test
    public void whenIvanLessByFewNik() {
        int inIvan = 50;
        int inNik = 90;
        int expected = 2;
        int out = Fitness.calc(inIvan, inNik);
        Assert.assertEquals(expected, out);
/*        int month = Fitness.calc(50, 90);
        assertThat(month, is(2));*/
    }
}