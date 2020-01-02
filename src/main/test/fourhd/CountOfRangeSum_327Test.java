package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/26.
 */
public class CountOfRangeSum_327Test {
    CountOfRangeSum_327 test = new CountOfRangeSum_327();

    @Test
    public void countRangeSum() throws Exception {
        assertEquals(3, test.countRangeSum(new int[]{-2,5,-1}, -2, 2));
    }

}