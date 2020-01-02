package fourhd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/27.
 */
public class CountingBits_338Test {
    CountingBits_338 test = new CountingBits_338();

    @Test
    public void countBits() throws Exception {
        assertTrue(Arrays.equals(new int[]{0,1,1,2,1,2}, test.countBits(5)));
        assertTrue(Arrays.equals(new int[]{0,1,1}, test.countBits(2)));
    }

}