package onehd;

/**
 * Created by Kexiang on 2019/9/26.
 */
public class UniquePathsTwo_63 {
    Integer[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length==0) return 0;
        if(obstacleGrid[0].length==0) return 0;
        dp = new Integer[obstacleGrid.length+1][obstacleGrid[0].length+1];
        return countPaths(obstacleGrid, 0, 0);
    }

    /**
     * Count the paths that starts at (x,y),
     * dp with obstacle check
     */
    public int countPaths(int[][] map, int x, int y){
        if(dp[y][x] != null) return dp[y][x];
        if(y<map.length && x<map[0].length && map[y][x]==1) return 0;
        if(y==map.length-1 && x==map[0].length-1) return 1;
        int countRight = x<map[0].length ? countPaths(map,x+1,y) : 0;
        int countDown = y<map.length ? countPaths(map, x, y+1) : 0;
        dp[y][x] = countDown + countRight;
        return dp[y][x];
    }

}
