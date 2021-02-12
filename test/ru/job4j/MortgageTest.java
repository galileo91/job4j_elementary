package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when1Year() {
        int inAmount = 1000;
        int inSalary = 1200;
        int inPercent = 1;
        int expected = 1;
        int out = Mortgage.year(inAmount, inSalary, inPercent);
        Assert.assertEquals(expected, out);
/*        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));*/
    }

    @Test
    public void when2Year() {
        int inAmount = 100;
        int inSalary = 120;
        int inPercent = 50;
        int expected = 2;
        int out = Mortgage.year(inAmount, inSalary, inPercent);
        Assert.assertEquals(expected, out);
/*        int year = Mortgage.year(100, 120, 50);
        assertThat(year, is(2));*/
    }
}