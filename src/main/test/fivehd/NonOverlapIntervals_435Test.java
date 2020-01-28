package fivehd;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonOverlapIntervals_435Test {
    NonOverlapIntervals_435 test = new NonOverlapIntervals_435();

    @Test
    public void eraseOverlapIntervals() {
        int[][] arr;

        arr = new int[][]{new int[]{1,100}, new int[]{11,22}, new int[]{1, 11}, new int[]{2,12}};
        assertEquals(2, test.eraseOverlapIntervals(arr));
        arr = new int[][]{};
        assertEquals(0, test.eraseOverlapIntervals(arr));
        arr = new int[][]{new int[]{1,2},new int[]{2,3},new int[]{3,4},new int[]{1,3}};
        assertEquals(1, test.eraseOverlapIntervals(arr));
        arr = new int[][]{new int[]{1,2},new int[]{1,2},new int[]{1,2}};
        assertEquals(2, test.eraseOverlapIntervals(arr));
        arr = new int[][]{new int[]{1,2},new int[]{2,3}};
        assertEquals(0, test.eraseOverlapIntervals(arr));
    }
}