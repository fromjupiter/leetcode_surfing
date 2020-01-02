package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/26.
 */
public class RemoveDupLetters_316Test {
    RemoveDupLetters_316 test = new RemoveDupLetters_316();

    @Test
    public void removeDuplicateLetters() throws Exception {
        assertEquals("abc", test.removeDuplicateLetters("bcabc"));
        assertEquals("acdb", test.removeDuplicateLetters("cbacdcbc"));
    }

}