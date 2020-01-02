package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/26.
 */
public class LongestIncreasingPath_329Test {
    LongestIncreasingPath_329 test = new LongestIncreasingPath_329();

    @Test
    public void longestIncreasingPath() throws Exception {
        int[][] map;

        map = new int[][]{
                new int[]{9,9,4},
                new int[]{6,6,8},
                new int[]{2,1,1},
        };
        assertEquals(4, test.longestIncreasingPath(map));
    }

}