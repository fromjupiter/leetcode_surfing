package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ThinkPad on 2019/9/14.
 */
public class Substr_3Test {
    @Test
    public void lengthOfLongestSubstring() throws Exception {
        assertEquals(2, new Substr_3().lengthOfLongestSubstring("abba"));
        assertEquals(3, new Substr_3().lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, new Substr_3().lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, new Substr_3().lengthOfLongestSubstring("pwwkew"));
        assertEquals(1, new Substr_3().lengthOfLongestSubstring(" "));
        assertEquals(7, new Substr_3().lengthOfLongestSubstring("abcdefg"));
    }

}