package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/14.
 */
public class LongestConsecutiveSeq_128Test {
    @Test
    public void longestConsecutiveTest() throws Exception {
        LongestConsecutiveSeq_128 test = new LongestConsecutiveSeq_128();
        assertEquals(5, test.longestConsecutive(new int[]{-2,-3,-3,7,-3,0,5,0,-8,-4,-1,2}));
        assertEquals(4, test.longestConsecutive(new int[]{-7,-1,3,-9,-4,7,-3,2,4,9,4,-9,8,-7,5,-1,-7}));
        assertEquals(5, test.longestConsecutive(new int[]{1,3,3,3,3,5,2,4}));
        assertEquals(0, test.longestConsecutive(new int[]{}));
        assertEquals(1, test.longestConsecutive(new int[]{100}));
        assertEquals(4, test.longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

}