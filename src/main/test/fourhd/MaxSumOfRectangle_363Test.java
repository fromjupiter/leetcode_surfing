package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/27.
 */
public class MaxSumOfRectangle_363Test {
    MaxSumOfRectangle_363 test = new MaxSumOfRectangle_363();

    @Test
    public void maxSumSubmatrix() throws Exception {
        int[][] mat;
        mat = new int[][]{
                new int[]{2,2,-1},
        };
        assertEquals(3, test.maxSumSubmatrix(mat, 3));
        mat = new int[][]{
                new int[]{1,0,1},
                new int[]{0,-2,3},
        };
        assertEquals(2, test.maxSumSubmatrix(mat, 2));
    }

}