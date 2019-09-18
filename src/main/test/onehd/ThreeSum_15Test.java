package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSum_15Test {
    @Test
    public void threeSumTest() throws Exception {
        ThreeSum_15 test = new ThreeSum_15();
        assertEquals(1, test.threeSum(new int[]{0,0,0,0,0}).size());
        assertEquals(2, test.threeSum(new int[]{-1,0,1,2,-1,-4}).size());
    }

}