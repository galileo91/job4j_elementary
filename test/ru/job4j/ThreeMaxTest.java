package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int inA = 10;
        int inB = 5;
        int inC = 1;
        int expected = 10;
        int out = ThreeMax.max(inA, inB, inC);
        Assert.assertEquals(expected, out);
/*        int rsl = ThreeMax.max(10, 5, 1);
        assertThat(rsl, is(10));*/
    }

    @Test
    public void secondMax() {
        int inA = 10;
        int inB = 50;
        int inC = 1;
        int expected = 50;
        int out = ThreeMax.max(inA, inB, inC);
        Assert.assertEquals(expected, out);
/*        int rsl = ThreeMax.max(10, 50, 1);
        assertThat(rsl, is(50));*/
    }

    @Test
    public void thirdMax() {
        int inA = 1;
        int inB = 5;
        int inC = 100;
        int expected = 100;
        int out = ThreeMax.max(inA, inB, inC);
        Assert.assertEquals(expected, out);
/*        int rsl = ThreeMax.max(1, 5, 100) ;
        assertThat(rsl, is(100));*/
    }

    @Test
    public void allEq() {
        int inA = 1;
        int inB = 1;
        int inC = 1;
        int expected = 1;
        int out = ThreeMax.max(inA, inB, inC);
        Assert.assertEquals(expected, out);
/*        int rsl = ThreeMax.max(1, 1, 1);
        assertThat(rsl, is(1));*/
    }

    @Test
    public void firstEqSecond() {
        int inA = 10;
        int inB = 10;
        int inC = 1;
        int expected = 10;
        int out = ThreeMax.max(inA, inB, inC);
        Assert.assertEquals(expected, out);
/*        int rsl = ThreeMax.max(10, 10, 1);
        assertThat(rsl, is(10));*/
    }

    @Test
    public void firstEqThird() {
        int inA = 100;
        int inB = 1;
        int inC = 100;
        int expected = 100;
        int out = ThreeMax.max(inA, inB, inC);
        Assert.assertEquals(expected, out);
/*        int rsl = ThreeMax.max(100, 1, 100);
        assertThat(rsl, is(100));*/
    }

    @Test
    public void secondEqThird() {
        int inA = 1;
        int inB = 100;
        int inC = 100;
        int expected = 100;
        int out = ThreeMax.max(inA, inB, inC);
        Assert.assertEquals(expected, out);
/*        int rsl = ThreeMax.max(1, 100, 100);
        assertThat(rsl, is(100));*/
    }
}