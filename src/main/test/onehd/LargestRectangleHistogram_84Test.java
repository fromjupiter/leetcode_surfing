package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class LargestRectangleHistogram_84Test {
    @Test
    public void largestRectangleAreaTest() throws Exception {
        LargestRectangleHistogram_84 test = new LargestRectangleHistogram_84();
        assertEquals(0, test.largestRectangleArea(new int[]{}));
        assertEquals(5, test.largestRectangleArea(new int[]{5}));
        assertEquals(10, test.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

}