package onehd;

/**
 * Created by Kexiang on 2019/9/26.
 */
public class UniquePaths_62 {
    Integer[][] dp;
    public int uniquePaths(int m, int n) {
        //m right move, n down move, we can do dp
        dp = new Integer[m][n];
        return countPaths(m-1,n-1);
    }

    private int countPaths(int m, int n) {
        if(dp[m][n]!=null) return dp[m][n];
        if(m==0 || n == 0){
            dp[m][n] = 1;
        } else dp[m][n] = countPaths(m-1,n) + countPaths(m,n-1);
        return dp[m][n];
    }
}
