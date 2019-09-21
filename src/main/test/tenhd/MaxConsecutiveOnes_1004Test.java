package tenhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/20.
 */
public class MaxConsecutiveOnes_1004Test {
    @Test
    public void longestOnes() throws Exception {
        MaxConsecutiveOnes_1004 test = new MaxConsecutiveOnes_1004();
        assertEquals(4, test.longestOnes(new int[]{0,0,0,1}, 4));
        assertEquals(4, test.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 0));
        assertEquals(6, test.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

}