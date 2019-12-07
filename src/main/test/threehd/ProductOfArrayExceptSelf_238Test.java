package threehd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/4.
 */
public class ProductOfArrayExceptSelf_238Test {
    @Test
    public void testProductExceptSelf() throws Exception {
        ProductOfArrayExceptSelf_238 test = new ProductOfArrayExceptSelf_238();
        assertTrue(Arrays.equals(new int[]{24,12,8,6}, test.productExceptSelf(new int[]{1,2,3,4})));
    }

}