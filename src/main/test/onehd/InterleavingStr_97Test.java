package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class InterleavingStr_97Test {
    @Test
    public void isInterleaveTest() throws Exception {
        InterleavingStr_97 test = new InterleavingStr_97();
        assertEquals(true, test.isInterleave("a","b","ab"));
        assertEquals(true, test.isInterleave("","b","b"));
        assertEquals(true, test.isInterleave("aabcc","dbbca","aadbbcbcac"));
        assertEquals(false, test.isInterleave("aabcc","dbbca","aadbbbaccc"));
    }

}