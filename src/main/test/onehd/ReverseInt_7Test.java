package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/15.
 */
public class ReverseInt_7Test {
    @Test
    public void reverse() throws Exception {
        ReverseInt_7 test = new ReverseInt_7();
        assertEquals(0, test.reverse(1534236469));
        assertEquals(0, test.reverse(2147483647));
        assertEquals(321, test.reverse(123));
        assertEquals(-321, test.reverse(-123));
        assertEquals(21, test.reverse(120));
    }

}