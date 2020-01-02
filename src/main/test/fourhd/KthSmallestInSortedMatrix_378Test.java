package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/27.
 */
public class KthSmallestInSortedMatrix_378Test {
    KthSmallestInSortedMatrix_378 test = new KthSmallestInSortedMatrix_378();

    @Test
    public void kthSmallest() throws Exception {
        int[][] mat;

        mat = new int[][]{
                new int[]{1,3,5},
                new int[]{6,7,12},
                new int[]{11,14,14},
        };
        assertEquals(5, test.kthSmallest(mat, 3));

        mat = new int[][]{
                new int[]{1,2},
                new int[]{3,3},
        };
        assertEquals(3, test.kthSmallest(mat, 4));

        mat = new int[][]{
                new int[]{1,5,9},
                new int[]{10,11,13},
                new int[]{12,13,15},
        };
        assertEquals(13, test.kthSmallest(mat, 8));
    }

}