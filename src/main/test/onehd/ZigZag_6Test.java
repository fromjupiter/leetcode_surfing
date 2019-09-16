package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/15.
 */
public class ZigZag_6Test {
    @Test
    public void convertTest() throws Exception {
        ZigZag_6 test = new ZigZag_6();
        assertEquals("PAHNAPLSIIGYIR",test.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI",test.convert("PAYPALISHIRING", 4));
    }

}