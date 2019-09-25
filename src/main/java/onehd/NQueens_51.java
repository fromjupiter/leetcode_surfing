package onehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/25.
 */
public class NQueens_51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        dfs(0, ans, new boolean[n], new boolean[3*n-2], new boolean[3*n-2], new int[n]);
        return ans;
    }

    public void dfs(int level, List<List<String>> ans, boolean[] verticalVisited, boolean[] diagonalRightVisited, boolean[] diagonalLeftVisited, int[] path) {
        int n = verticalVisited.length;
        if(level==n){
            ans.add(IntToString(path));
        }
        for(int i=0;i<n;++i){
            if(!verticalVisited[i]){
                int rInd = i+level+n-1, lInd = i-level+n-1;
                if(diagonalRightVisited[rInd]) continue;
                if(diagonalLeftVisited[lInd]) continue;

                path[level] = i;
                verticalVisited[i]=true;
                diagonalLeftVisited[lInd]=true;
                diagonalRightVisited[rInd]=true;
                dfs(level+1, ans, verticalVisited, diagonalRightVisited, diagonalLeftVisited, path);
                path[level] = -1;
                verticalVisited[i]=false;
                diagonalLeftVisited[lInd]=false;
                diagonalRightVisited[rInd]=false;
            }
        }
    }

    private List<String> IntToString(int[] path){
        List<String> res = new ArrayList<>();
        for(int i=0;i<path.length;++i) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < path.length; ++j) {
                sb.append(j == path[i] ? 'Q' : '.');
            }
            res.add(sb.toString());
        }
        return res;
    }
}
