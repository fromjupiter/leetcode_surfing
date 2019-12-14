package fourhd;

/**
 * Created by Kexiang on 2019/12/8.
 */
public class BestTimeBuySellCooldown_309 {
    //dp
    public int maxProfit0(int[] prices) {
        if(prices.length<2) return 0;

        int[] hold = new int[prices.length];
        int[] sell = new int[prices.length];
        hold[0] = -prices[0];
        sell[0] = 0;
        hold[1] = Math.max(-prices[0], -prices[1]);
        sell[1] = Math.max(0, prices[1] - prices[0]);
        for(int i=2;i<prices.length;++i) {
            hold[i] = Math.max(hold[i-1], sell[i-2]-prices[i]);
            sell[i] = Math.max(hold[i-1]+prices[i], sell[i-1]);
        }
        return Math.max(sell[prices.length-1], hold[prices.length-1]);
    }
    //better DP with no space overhead
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;

        int hold = Math.max(-prices[0], -prices[1]);
        int prev_sell = 0;
        int sell = Math.max(0, prices[1] - prices[0]);
        for(int i=2;i<prices.length;++i) {
            int temp = prev_sell;
            prev_sell = sell;
            sell = Math.max(hold+prices[i], sell);
            hold = Math.max(hold, temp-prices[i]);
        }
        return Math.max(sell, hold);
    }
}
