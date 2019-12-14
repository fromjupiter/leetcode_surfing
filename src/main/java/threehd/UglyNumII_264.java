package threehd;


public class UglyNumII_264 {
    int[] dp;

    public int nthUglyNumber(int n) {
        dp = new int[n];
        dp[0] = 1;
        //number counter
        int p2=0, p3=0, p5=0;
        for(int i=1;i<n;++i) {
            dp[i] = Math.min(Math.min(dp[p2]*2, dp[p3]*3), dp[p5]*5);
            if(dp[i] == dp[p2]*2)
                ++p2;
            if(dp[i] == dp[p3]*3)
                ++p3;
            if(dp[i] == dp[p5]*5)
                ++p5;
        }
        return dp[n-1];
    }
}
