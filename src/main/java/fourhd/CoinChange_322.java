package fourhd;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CoinChange_322 {
    public int coinChange(int[] coins, int amount) {
//        Map<Integer, Integer> dp = new HashMap<>();
//        dp.put(0, 0);
//        return coinChange(dp, coins, amount);

        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=1;i<=amount;++i) {
            for(int j=0;j<coins.length;++j) {
                if(i<coins[j] || Integer.MAX_VALUE==dp[i-coins[j]]) continue;
                dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
            }
        }
        return dp[amount]==Integer.MAX_VALUE ? -1 : dp[amount];

    }

    /**
     * naive dp
     */
    private int coinChange(Map<Integer, Integer> dp, int[] coins, int amount) {
        if(dp.containsKey(amount)) return dp.get(amount);
        int best = Integer.MAX_VALUE;
        for(int coin : coins) {
            if(amount>=coin) {
                int temp = coinChange(dp, coins, amount - coin);
                if(temp!=-1) best = Math.min(best, temp + 1);
            }
        }
        if(Integer.MAX_VALUE==best)
            best = -1;
        dp.put(amount, best);
        return best;
    }
}
