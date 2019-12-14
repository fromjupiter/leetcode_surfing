package threehd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class DiffWaysToCompute_241Test {
    @Test
    public void diffWaysToCompute() throws Exception {
        DiffWaysToCompute_241 test = new DiffWaysToCompute_241();
        Assert.assertEquals("[2, 0]", test.diffWaysToCompute("2-1-1").toString());
        Assert.assertEquals("[-34, -10, -14, -10, 10]", test.diffWaysToCompute("2*3-4*5").toString());
    }

}