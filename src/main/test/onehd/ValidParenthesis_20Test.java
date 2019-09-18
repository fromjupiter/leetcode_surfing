package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/17.
 */
public class ValidParenthesis_20Test {
    @Test
    public void isValidTest() throws Exception {
        ValidParenthesis_20 test = new ValidParenthesis_20();
        assertEquals(false, test.isValid("]"));
        assertEquals(true, test.isValid("()"));
        assertEquals(true, test.isValid("()[]{}"));
        assertEquals(false, test.isValid("(]"));
        assertEquals(false, test.isValid("([)]"));
        assertEquals(true, test.isValid("{[]}"));
    }

}