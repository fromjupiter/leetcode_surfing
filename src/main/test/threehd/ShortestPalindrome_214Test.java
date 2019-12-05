package threehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/3.
 */
public class ShortestPalindrome_214Test {
    @Test
    public void testShortestPalindrome() throws Exception {
        ShortestPalindrome_214 test = new ShortestPalindrome_214();
        assertEquals("aaacecaaa", test.shortestPalindrome("aacecaaa"));
        assertEquals("dcbabcd", test.shortestPalindrome("abcd"));
    }

}