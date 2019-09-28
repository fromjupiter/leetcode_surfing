package onehd;

/**
 * Created by Kexiang on 2019/9/26.
 */
public class MinimumPathSum_64 {
    Integer[][] dp;
    public int minPathSum(int[][] grid) {
        if(grid.length==0) return 0;
        if(grid[0].length==0) return 0;

        dp = new Integer[grid.length][grid[0].length];

        return minSum_nonRecursive(grid, 0, 0);
    }

    private int minSum_Recursive(int[][] grid, int x, int y) {
        if(y==grid.length || x==grid[0].length) return Integer.MAX_VALUE;
        if(y==grid.length-1 && x==grid[0].length-1) {
            return grid[y][x];
        }
        if(dp[y][x]!=null) return dp[y][x];
        dp[y][x] = grid[y][x]+Math.min(minSum_Recursive(grid,x+1,y), minSum_Recursive(grid, x, y+1));
        return dp[y][x];
    }

    private int minSum_nonRecursive(int[][] grid, int x, int y) {
        dp[grid.length-1][grid[0].length-1] = grid[grid.length-1][grid[0].length-1];
        for(int i=dp[0].length-2;i>=0;--i){
            dp[grid.length-1][i] = grid[grid.length-1][i] + dp[grid.length-1][i+1];
        }
        for(int i=dp.length-2;i>=0;--i){
            dp[i][grid[0].length-1] = grid[i][grid[0].length-1] + dp[i+1][grid[0].length-1];
        }
        for(int i=grid.length-2;i>=0;--i){
            for(int j=grid[0].length-2;j>=0;--j){
                dp[i][j]=grid[i][j]+Math.min(dp[i+1][j], dp[i][j+1]);
            }
        }

        return dp[0][0];
    }

}
