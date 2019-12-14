package threehd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class PerfectSquare_279Test {
    @Test
    public void numSquares() throws Exception {
        PerfectSquare_279 test = new PerfectSquare_279();
        assertEquals(3, test.numSquares(12));
        assertEquals(2, test.numSquares(13));
    }

}