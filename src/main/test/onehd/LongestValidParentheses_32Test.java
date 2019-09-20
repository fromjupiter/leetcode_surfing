package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/19.
 */
public class LongestValidParentheses_32Test {
    @Test
    public void longestValidParenthesesTest() throws Exception {
        LongestValidParentheses_32 test = new LongestValidParentheses_32();
        assertEquals(4, test.longestValidParentheses(")()())()()("));
        assertEquals(4, test.longestValidParentheses("(()()"));
        assertEquals(2, test.longestValidParentheses("()(()"));
        assertEquals(2, test.longestValidParentheses("(()"));
        assertEquals(4, test.longestValidParentheses(")()())"));
    }
}