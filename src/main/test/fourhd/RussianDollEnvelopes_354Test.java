package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/27.
 */
public class RussianDollEnvelopes_354Test {

    RussianDollEnvelopes_354 test = new RussianDollEnvelopes_354();

    @Test
    public void maxEnvelopes() throws Exception {
        int[][] envs;
        envs = new int[][] {
                new int[]{1,2},new int[]{2,3},new int[]{3,4},new int[]{3,5},
                new int[]{4,5},new int[]{5,5},new int[]{5,6},new int[]{6,7},
                new int[]{7,8},
        };
        assertEquals(7, test.maxEnvelopes(envs));
        envs = new int[][] {
                new int[]{30,50},
                new int[]{12,2},
                new int[]{3,4},
                new int[]{12,15},
        };
        assertEquals(3, test.maxEnvelopes(envs));
        envs = new int[][] {
                new int[]{5,4},
                new int[]{6,4},
                new int[]{6,7},
                new int[]{2,3},
        };
        assertEquals(3, test.maxEnvelopes(envs));
        envs = new int[][] {
                new int[]{4,5},
                new int[]{4,6},
                new int[]{6,7},
                new int[]{2,3},
                new int[]{1,1},
        };
        assertEquals(4, test.maxEnvelopes(envs));
        envs = new int[][] {
                new int[]{10,8},
                new int[]{1,12},
                new int[]{6,15},
                new int[]{2,18},
        };
        assertEquals(2, test.maxEnvelopes(envs));
    }

}