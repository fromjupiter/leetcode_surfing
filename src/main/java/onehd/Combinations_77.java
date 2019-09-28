package onehd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/28.
 */
public class Combinations_77 {
    /**
     * non recursive dfs
     */
    public List<List<Integer>> combine_v0(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] path = new int[k];
        int cursor = 0;
        int level = 1;
        while(true){
            if(cursor==k){
                ArrayList<Integer> temp = new ArrayList<>(k);
                for(int i=0;i<k;++i) temp.add(path[i]);
                ans.add(temp);
            }
            if(cursor==k || level>n){
                if(0==cursor) break;
                //pop stack
                level = path[--cursor]+1;
            } else {
                path[cursor++] = level++;
            }
        }
        return ans;
    }
    /**
     * basic recursive dfs
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(ans, new int[k], 0, n, k);
        return ans;
    }

    private void dfs(List<List<Integer>> ans, int[] path, int cursor, int n, int k) {
        if(cursor==k){
            ArrayList<Integer> temp = new ArrayList<>(k);
            for(int i=0;i<k;++i) temp.add(path[i]);
            ans.add(temp);
            return;
        }
        for(int i= cursor==0 ? 1 : path[cursor-1]+1;i<=n;++i){
            path[cursor++]=i;
            dfs(ans, path, cursor, n, k);
            cursor--;
        }
    }
}
