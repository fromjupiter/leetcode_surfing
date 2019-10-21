package twohd;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class BestTimeBuySellStockFour_188 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if(n<2 || k==0) return 0;
        if(k>n/2) return maxProfitTwo(prices);
        int[] cash = new int[k];
        int[] hold = new int[k];
        for(int i=0;i<hold.length;++i) hold[i]=-prices[0];
        for (int i=1;i<n;++i) {
            for(int j=0;j<k;++j){
                cash[j] = Math.max(cash[j], prices[i]+hold[j]);
                hold[j] = Math.max(hold[j], (j==0?0:cash[j-1])-prices[i]);
            }
        }
        return cash[k-1];
    }
    public int maxProfitTwo(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}
