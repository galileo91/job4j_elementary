package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int inX1 = 6;
        int inY1 = 7;
        int inX2 = 1;
        int inY2 = 2;
        int expected = 5;
        int out = ChessBoard.way(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out);
  /*      int way = ChessBoard.way(6, 7, 1, 2);
        assertThat(way, is(5));*/
    }

    @Test
    public void wayIs7() {
        int inX1 = 7;
        int inY1 = 0;
        int inX2 = 0;
        int inY2 = 7;
        int expected = 7;
        int out = ChessBoard.way(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out);
/*        int way = ChessBoard.way(7, 0, 0, 7);
        assertThat(way, is(7));*/
    }

    @Test
    public void wayIs0() {
        int inX1 = 2;
        int inY1 = 6;
        int inX2 = 5;
        int inY2 = 1;
        int expected = 0;
        int out = ChessBoard.way(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out);
/*        int way = ChessBoard.way(2, 6, 4, 1);
        assertThat(way, is(0));*/
    }
}