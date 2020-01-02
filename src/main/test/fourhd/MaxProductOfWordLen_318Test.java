package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/26.
 */
public class MaxProductOfWordLen_318Test {
    MaxProductOfWordLen_318 test = new MaxProductOfWordLen_318();

    @Test
    public void maxProduct() throws Exception {
        String[] arr;

        arr = new String[]{"abcw","baz","foo","bar","xtfn","abcdef"};
        assertEquals(16, test.maxProduct(arr));
    }
}