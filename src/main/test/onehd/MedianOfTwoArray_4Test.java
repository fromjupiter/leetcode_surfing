package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoArray_4Test {
    @Test
    public void findMedianSortedArraysTest() throws Exception {
        MedianOfTwoArray_4 test = new MedianOfTwoArray_4();
        assertEquals(30, test.findMedianSortedArrays(new int[]{4,20,32,50,55,61}, new int[]{1,15,22,30,70}), 0.001);
        assertEquals(1.5, test.findMedianSortedArrays(new int[]{1,2}, new int[]{-1,3}), 0.001);
        assertEquals(1.0, test.findMedianSortedArrays(new int[]{}, new int[]{1}), 0.001);
        assertEquals(2.5, test.findMedianSortedArrays(new int[]{}, new int[]{2,3}), 0.001);
        assertEquals(1.5, test.findMedianSortedArrays(new int[]{1,2}, new int[]{1,3}), 0.001);
        assertEquals(2.0, test.findMedianSortedArrays(new int[]{1,3}, new int[]{2}), 0.001);
        assertEquals(2.5, test.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}), 0.001);
    }

}