package onehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/26.
 */
public class UniquePathsTwo_63Test {
    @Test
    public void uniquePathsWithObstacles() throws Exception {
        UniquePathsTwo_63 test = new UniquePathsTwo_63();
        int[][] arr = new int[][]{new int[]{0,0,0},new int[]{0,1,0},new int[]{0,0,0}};
        assertEquals(2, test.uniquePathsWithObstacles(arr));
    }
}