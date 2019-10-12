package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class BestTimeBuySellStockThree_123Test {
    @Test
    public void maxProfit() throws Exception {
        BestTimeBuySellStockThree_123 test = new BestTimeBuySellStockThree_123();
        assertEquals(6,test.maxProfit(new int[]{3,3,5,0,0,3,1,4}));
        assertEquals(4,test.maxProfit(new int[]{1,2,3,4,5}));
    }

}