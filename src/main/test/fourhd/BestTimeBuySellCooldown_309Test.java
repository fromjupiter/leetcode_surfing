package fourhd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/12/8.
 */
public class BestTimeBuySellCooldown_309Test {
    @Test
    public void maxProfit() throws Exception {
        BestTimeBuySellCooldown_309 test = new BestTimeBuySellCooldown_309();
        assertEquals(3, test.maxProfit(new int[]{1,2,3,0,2}));
    }

}