package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/19.
 */
public class LargestNum_179Test {
    @Test
    public void largestNumberTest() throws Exception {
        LargestNum_179 test = new LargestNum_179();
        assertEquals("12121", test.largestNumber(new int[]{121,12}));
        assertEquals("9534330", test.largestNumber(new int[]{3,30,34,5,9}));
        assertEquals("9609938824824769735703560743981399", test.largestNumber(new int[]{824,938,1399,5607,6973,5703,9609,4398,8247}));
        assertEquals("210", test.largestNumber(new int[]{10,2}));
    }
}