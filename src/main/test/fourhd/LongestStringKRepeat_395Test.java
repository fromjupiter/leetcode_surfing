package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;


public class LongestStringKRepeat_395Test {
    LongestStringKRepeat_395 test = new LongestStringKRepeat_395();

    @Test
    public void longestSubstring() throws Exception {

        assertEquals(0, test.longestSubstring("ababacb", 3));
        assertEquals(5, test.longestSubstring("ababbc", 2));
        assertEquals(3, test.longestSubstring("aaabb", 3));
    }

}