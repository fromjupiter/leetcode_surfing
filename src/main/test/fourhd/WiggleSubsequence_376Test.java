package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/27.
 */
public class WiggleSubsequence_376Test {
    WiggleSubsequence_376 test = new WiggleSubsequence_376();

    @Test
    public void wiggleMaxLength() throws Exception {
        assertEquals(2, test.wiggleMaxLength(new int[]{3,2,2,1}));
        assertEquals(6, test.wiggleMaxLength(new int[]{1,7,4,9,2,5}));
        assertEquals(7, test.wiggleMaxLength(new int[]{1,17,5,10,13,15,10,5,16,8}));
    }

}