package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/27.
 */
public class MinWindowSubstr76Test {
    @Test
    public void minWindowTest() throws Exception {
        MinWindowSubstr_76 test = new MinWindowSubstr_76();
        assertEquals("b", test.minWindow("ab","b"));
        assertEquals("", test.minWindow("a","aa"));
        assertEquals("BANC", test.minWindow("ADOBECODEBANC","ABC"));
    }

}