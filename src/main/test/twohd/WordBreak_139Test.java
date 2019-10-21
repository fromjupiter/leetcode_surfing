package twohd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/19.
 */
public class WordBreak_139Test {
    @Test
    public void wordBreakTest() throws Exception {
        WordBreak_139 test = new WordBreak_139();
        assertEquals(true, test.wordBreak("leetcode", Arrays.asList("leet","code")));
        assertEquals(false, test.wordBreak("catsandog", Arrays.asList("cats","dog","sand","and","cat")));
    }
}