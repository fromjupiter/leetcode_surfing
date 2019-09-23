package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class WildCard_44Test {
    @Test
    public void isMatch() throws Exception {
        WildCard_44 test = new WildCard_44();
        assertEquals(true, test.isMatch_v0("adceb", "*a*b"));
        assertEquals(true, test.isMatch_v0("ho", "ho**"));
        assertEquals(false, test.isMatch_v0("", "*a*"));
        assertEquals(false, test.isMatch_v0("b", "?*?"));
        assertEquals(false, test.isMatch_v0("mississippi", "m??*ss*?i*pi"));
        assertEquals(true, test.isMatch_v0("adceb", "a*b"));
        assertEquals(true, test.isMatch_v0("aa", "*"));
        assertEquals(false, test.isMatch_v0("aa", "a"));
        assertEquals(true, test.isMatch_v0("", ""));
        assertEquals(true, test.isMatch_v0("", "*"));
        assertEquals(false, test.isMatch_v0("cb", "?a"));
        assertEquals(false, test.isMatch_v0("acdcb", "a*c?b"));
    }

}