package fivehd;

import org.junit.Test;

import static org.junit.Assert.*;

public class SplitArrayLargestSum_410Test {
    SplitArrayLargestSum_410 test = new SplitArrayLargestSum_410();

    @Test
    public void splitArray() throws Exception {
        assertEquals(18, test.splitArray(new int[]{7,2,5,10,8}, 2));
    }

}