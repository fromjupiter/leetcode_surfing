package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;


public class DecodeString_394Test {
    DecodeString_394 test = new DecodeString_394();

    @Test
    public void decodeString() throws Exception {
        assertEquals("aaabcbc", test.decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", test.decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", test.decodeString("2[abc]3[cd]ef"));
    }

}