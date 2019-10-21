package twohd;

/**
 * Created by Kexiang on 2019/10/19.
 */
public class DungeonGame_174 {
    /**
     * dp:
     * dp[x][y] = dungeon[x][y]<0 ? -dungeon[x][y] + min(dp[x+1][y], dp[x][y+1])) :
     *                  max(0, min(dp[x+1][y], dp[x][y+1]) - dungeon[x][y]))
     */
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon.length==0) return 1;
        int[] dp = new int[dungeon.length+1];
        for (int i=0;i<=dungeon.length;++i) {
            dp[i] = Integer.MAX_VALUE;
        }
        //trick to support calculation of princess point
        dp[dungeon.length-1] = 1;
        for(int j=dungeon[0].length-1;j>=0;--j){
            for (int i=dungeon.length-1; i>=0; --i) {
                dp[i] = Math.max(1, Math.min(dp[i], dp[i+1])-dungeon[i][j]);
            }
        }
        return dp[0];
    }
}
