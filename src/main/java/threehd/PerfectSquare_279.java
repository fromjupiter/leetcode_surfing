package threehd;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kexiang on 2019/12/6.
 */
public class PerfectSquare_279 {

    int[] dp;
    /*
        Greedy with dp
     */
    public int numSquares(int n) {
        dp = new int[n+1];

        dp[0] = 0;
        for(int i=1;i<=n;++i) {
            dp[i] = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;++j) {
                dp[i] = Math.min(dp[i], dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
}
