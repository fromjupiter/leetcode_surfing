package twohd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class BestTimeBuySellStockFour_188Test {
    @Test
    public void maxProfitTest() throws Exception {
        BestTimeBuySellStockFour_188 test = new BestTimeBuySellStockFour_188();
        assertEquals(7, test.maxProfit(2, new int[]{3,2,6,5,0,3}));
    }

}