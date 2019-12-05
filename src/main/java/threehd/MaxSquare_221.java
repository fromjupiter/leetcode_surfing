package threehd;


public class MaxSquare_221 {
    /**
     * dp[i][j] means "the max square whose left top corner starts at (i,j)
     * dp[i][j] = min(dp[i][j+1],dp[i+1][j],dp[i+1][j+1])+1
     */
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0) return 0;

        int[][] dp = new int[matrix.length][matrix[0].length];
        int res = 0;
        // init
        for(int i=0;i<matrix[0].length;++i) {
            dp[matrix.length - 1][i] = matrix[matrix.length - 1][i] - '0';
            if(dp[matrix.length - 1][i] == 1) res = 1;
        }
        for(int i=0;i<matrix.length;++i) {
            dp[i][matrix[0].length - 1] = matrix[i][matrix[0].length - 1] - '0';
            if(dp[i][matrix[0].length - 1] == 1) res = 1;
        }

        for(int i=matrix.length-2;i>=0;--i) {
            for(int j=matrix[0].length-2;j>=0;--j) {
                if(matrix[i][j]=='1')
                    dp[i][j] = Math.min(Math.min(dp[i][j+1],dp[i+1][j]),dp[i+1][j+1])+1;
                else dp[i][j] = 0;
                res = Math.max(res, dp[i][j]);
            }
        }
        return res*res;
    }
}
