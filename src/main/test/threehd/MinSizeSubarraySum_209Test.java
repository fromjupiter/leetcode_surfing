package threehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class MinSizeSubarraySum_209Test {
    @Test
    public void minSubArrayLenTest() throws Exception {
        MinSizeSubarraySum_209 test = new MinSizeSubarraySum_209();
        assertEquals(2, test.minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }

}