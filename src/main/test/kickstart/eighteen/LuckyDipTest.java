package kickstart.eighteen;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class LuckyDipTest {
    @Test
    public void solve() throws Exception {
        LuckyDip test = new LuckyDip();
        int[] arr;
        arr = new int[]{};
        assertEquals(0, test.solve(0,0,arr),1e-5);
        arr = new int[]{};
        assertEquals(0, test.solve(0,0,arr),1e-5);
        arr = new int[]{1,2,3,4};
        assertEquals(2.5, test.solve(4,0,arr),1e-5);
        arr = new int[]{1,10,1};
        assertEquals(6.0, test.solve(3,1,arr),1e-5);
        arr = new int[]{80000,80000,80000};
        assertEquals(80000.0, test.solve(3,15,arr),1e-5);
        arr = new int[]{16,11,7,4,1};
        assertEquals(12.3584, test.solve(5,3,arr),1e-5);
    }

}