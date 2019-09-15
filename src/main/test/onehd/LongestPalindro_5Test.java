package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/15.
 */
public class LongestPalindro_5Test {
    @Test
    public void longestPalindromeTest() throws Exception {
        LongestPalindro_5 test = new LongestPalindro_5();
        assertEquals("", test.longestPalindrome(""));
        assertEquals("a", test.longestPalindrome("a"));
        assertEquals("bb", test.longestPalindrome("cbbd"));
        assertEquals("bab", test.longestPalindrome("babad"));
        assertEquals("bbabb", test.longestPalindrome("abbabb"));
    }

}