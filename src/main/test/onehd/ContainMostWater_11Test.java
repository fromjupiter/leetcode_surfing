package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/16.
 */
public class ContainMostWater_11Test {
    @Test
    public void maxAreaTest() throws Exception {
        ContainMostWater_11 test = new ContainMostWater_11();
        assertEquals(2, test.maxArea(new int[]{1,1,1}));
        assertEquals(6, test.maxArea(new int[]{1,2,1,1,2,1}));
        assertEquals(49, test.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}