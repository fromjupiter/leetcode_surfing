package onehd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSum_1Test {

    @Test
    public void twoSum() {
        TwoSum_1 test = new TwoSum_1();
        int[] result = test.twoSum(new int[]{2,7,11,15}, 9);
        assertEquals(result[0], 0);
        assertEquals(result[1], 1);
    }
}