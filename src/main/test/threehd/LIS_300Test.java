package threehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class LIS_300Test {
    @Test
    public void lengthOfLIS() throws Exception {
        LIS_300 test = new LIS_300();
        assertEquals(3, test.lengthOfLIS(new int[]{10,9,2,5,3,4}));
        assertEquals(1, test.lengthOfLIS(new int[]{2,2}));
        assertEquals(4, test.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

}