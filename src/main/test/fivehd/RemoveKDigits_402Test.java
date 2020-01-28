package fivehd;

import org.junit.Test;

import static org.junit.Assert.*;


public class RemoveKDigits_402Test {
    RemoveKDigits_402 test = new RemoveKDigits_402();

    @Test
    public void removeKdigits() throws Exception {
        assertEquals("33", test.removeKdigits("5337", 2));
        assertEquals("0", test.removeKdigits("10", 1));
        assertEquals("0", test.removeKdigits("1234567890", 9));
        assertEquals("111", test.removeKdigits("11111", 2));
        assertEquals("11", test.removeKdigits("112", 1));
        assertEquals("1219", test.removeKdigits("1432219", 3));
        assertEquals("200", test.removeKdigits("10200", 1));
    }

}