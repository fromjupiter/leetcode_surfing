package fourhd;


public class LongestIncreasingPath_329 {
    /*
        dfs
     */
    int[][] memo;
    int[][] map;

    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0 || matrix[0].length==0) return 0;
        memo = new int[matrix.length][matrix[0].length];
        map = matrix;
        for(int i=0;i<matrix.length;++i) {
            for(int j=0;j<matrix[0].length;++j) {
                memo[i][j]=-1;
            }
        }
        int len = 0;
        for(int i=0;i<matrix.length;++i) {
            for(int j=0;j<matrix[0].length;++j) {
                len = Math.max(len, dfs(i, j, Integer.MIN_VALUE));
            }
        }
        return len;
    }

    private int dfs(int x, int y, int prev) {
        if(x<0||y<0||x>=map.length||y>=map[0].length||prev>=map[x][y]) {
            return 0;
        }
        if(memo[x][y] != -1) return memo[x][y];
        int a1 = dfs(x-1, y, map[x][y]);
        int a2 = dfs(x+1, y, map[x][y]);
        int a3 = dfs(x,y-1, map[x][y]);
        int a4 = dfs(x,y+1, map[x][y]);
        memo[x][y] = Math.max(a1,Math.max(a2,Math.max(a3,a4))) + 1;
        return memo[x][y];
    }
}
