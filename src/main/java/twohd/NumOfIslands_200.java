package twohd;

/**
 * Created by Kexiang on 2019/10/21.
 */
public class NumOfIslands_200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]=='1'){
                    ++count;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    //reset same island to 0
    public void dfs(char[][] grid, int i, int j) {
        grid[i][j]='0';
        if(i<grid.length-1 && '1'==grid[i+1][j]) dfs(grid, i+1,j);
        if(i>0 && '1'==grid[i-1][j]) dfs(grid, i-1,j);
        if(j<grid[0].length-1 && '1'==grid[i][j+1]) dfs(grid, i,j+1);
        if(j>0 && '1'==grid[i][j-1]) dfs(grid, i,j-1);
    }
}
