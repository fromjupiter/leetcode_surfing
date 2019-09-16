package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/15.
 */
public class Regex_10Test {
    @Test
    public void isMatchTest() throws Exception {
        Regex_10 test = new Regex_10();
        assertEquals(true, test.isMatch("bbbba",".*a*a"));
        assertEquals(true, test.isMatch("a","ab*"));
        assertEquals(true, test.isMatch("","c*c*"));
        assertEquals(false, test.isMatch("","."));
        assertEquals(false, test.isMatch("aaa","ab*a"));
        assertEquals(true, test.isMatch("",".*"));
        assertEquals(false, test.isMatch("aaa","aa"));
        assertEquals(false, test.isMatch("aa","aaaa"));
        assertEquals(false, test.isMatch("aa","a"));
        assertEquals(true, test.isMatch("aa","a*"));
        assertEquals(true, test.isMatch("ab", ".*"));
        assertEquals(true, test.isMatch("aab", "c*a*b"));
        assertEquals(false, test.isMatch("mississippi", "mis*is*p*."));
    }

}