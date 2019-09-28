package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/26.
 */
public class MinimumPathSum_64Test {
    @Test
    public void minPathSum() throws Exception {
        MinimumPathSum_64 test = new MinimumPathSum_64();
        int[][] arr;
        arr = new int[][]{new int[]{1,2,5},new int[]{3,2,1}};
        assertEquals(6, test.minPathSum(arr));

        arr = new int[][]{new int[]{1,3,1},new int[]{1,5,1},new int[]{4,2,1}};
        assertEquals(7, test.minPathSum(arr));


    }

}