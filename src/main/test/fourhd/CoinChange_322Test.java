package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/26.
 */
public class CoinChange_322Test {
    CoinChange_322 test = new CoinChange_322();

    @Test
    public void coinChange() throws Exception {
        assertEquals(20, test.coinChange(new int[]{186,419,83,408}, 6249));
        assertEquals(3, test.coinChange(new int[]{1,2,5}, 11));
        assertEquals(4, test.coinChange(new int[]{2,5}, 11));
        assertEquals(-1, test.coinChange(new int[]{5}, 11));
        assertEquals(-1, test.coinChange(new int[]{2}, 3));
    }

}