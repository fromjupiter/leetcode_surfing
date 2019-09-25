package onehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/25.
 */
public class NQueensTwo_52 {
    public int totalNQueens(int n) {
        int[] ans = new int[1];
        dfs(0, ans, new boolean[n], new boolean[3*n-2], new boolean[3*n-2]);
        return ans[0];
    }

    public void dfs(int level, int[] ans, boolean[] verticalVisited, boolean[] diagonalRightVisited, boolean[] diagonalLeftVisited) {
        int n = verticalVisited.length;
        if(level==n){
            ans[0]++;
        }
        for(int i=0;i<n;++i){
            if(!verticalVisited[i]){
                int rInd = i+level+n-1, lInd = i-level+n-1;
                if(diagonalRightVisited[rInd]) continue;
                if(diagonalLeftVisited[lInd]) continue;

                verticalVisited[i]=true;
                diagonalLeftVisited[lInd]=true;
                diagonalRightVisited[rInd]=true;
                dfs(level+1, ans, verticalVisited, diagonalRightVisited, diagonalLeftVisited);

                verticalVisited[i]=false;
                diagonalLeftVisited[lInd]=false;
                diagonalRightVisited[rInd]=false;
            }
        }
    }
}
