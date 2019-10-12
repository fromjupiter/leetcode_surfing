package twohd;

/**
 * Created by Kexiang on 2019/10/11.
 */
public class BestTimeBuySellStockThree_123 {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        //maxProfit[i] is the max profit in [i, prices.length)
        int[] maxProfit= new int[prices.length];
        fill(maxProfit, prices);

        int ans = 0;
        int minPrice = prices[0];
        //for each i, we calculate the best profit if we sell our first stock on i-th day
        for(int i=1;i<prices.length;++i) {
            ans = Math.max(ans, prices[i]-minPrice+maxProfit[i]);
            if(prices[i]<minPrice) minPrice = prices[i];
        }
        return ans;
    }

    public void fill(int[] maxProfits, int[] prices) {
        int maxPrice = 0;
        int maxProfit = 0;
        for(int i=prices.length-1;i>=0;--i){
            if(prices[i]>maxPrice) maxPrice = prices[i];
            else if (maxPrice - prices[i] > maxProfit)
                maxProfit = maxPrice - prices[i];
            maxProfits[i] = maxProfit;
        }
    }
}
