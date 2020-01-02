package fourhd;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/25.
 */
public class CountSmallerNumAfterSelf_315Test {
    CountSmallerNumAfterSelf_315 test = new CountSmallerNumAfterSelf_315();

    @Test
    public void countSmaller() throws Exception {
        Assert.assertEquals("[0, 1, 0]", test.countSmaller(new int[]{0,2,1}).toString());
        Assert.assertEquals("[0, 0, 0, 0]", test.countSmaller(new int[]{1,2,3,4}).toString());
        Assert.assertEquals("[2, 1, 1, 0]", test.countSmaller(new int[]{5,2,6,1}).toString());
        Assert.assertEquals("[0, 0]", test.countSmaller(new int[]{-1,-1}).toString());
        Assert.assertEquals("[0]", test.countSmaller(new int[]{1}).toString());
        Assert.assertEquals("[]", test.countSmaller(new int[]{}).toString());
    }

}