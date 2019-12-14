package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/8.
 */
public class BurstBalloons_312Test {
    BurstBalloons_312 test = new BurstBalloons_312();

    @Test
    public void maxCoins() throws Exception {
        assertEquals(167, test.maxCoins(new int[]{3,1,5,8}));
    }

}