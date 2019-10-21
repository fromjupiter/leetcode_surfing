package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/19.
 */
public class MaxGap_164Test {
    @Test
    public void maximumGapTest() throws Exception {
        MaxGap_164 test = new MaxGap_164();
        assertEquals(0, test.maximumGap(new int[]{1,1,1,1}));
        assertEquals(3, test.maximumGap(new int[]{3,6,9,1}));
        assertEquals(0, test.maximumGap(new int[]{10}));
    }

}