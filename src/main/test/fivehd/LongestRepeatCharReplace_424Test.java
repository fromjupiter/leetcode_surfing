package fivehd;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestRepeatCharReplace_424Test {
    LongestRepeatCharReplace_424 test = new LongestRepeatCharReplace_424();

    @Test
    public void characterReplacement() throws Exception {
        assertEquals(7, test.characterReplacement("ABAAABAAA", 1));
        assertEquals(4, test.characterReplacement("AABABBA", 1));
        assertEquals(4, test.characterReplacement("ABAB", 2));
    }

}