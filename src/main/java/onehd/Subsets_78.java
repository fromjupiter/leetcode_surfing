package onehd;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    /**
     * We can just use the dfs as in 77
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1;i<=nums.length;++i){
            dfs(ans, nums, new int[i], 0, nums.length, i);
        }
        ans.add(new ArrayList<>());
        return ans;
    }
    private void dfs(List<List<Integer>> ans, int[] nums, int[] path, int cursor, int n, int k) {
        if(cursor==k){
            ArrayList<Integer> temp = new ArrayList<>(k);
            for(int i=0;i<k;++i) temp.add(nums[path[i]]);
            ans.add(temp);
            return;
        }
        for(int i= cursor==0 ? 0 : path[cursor-1]+1;i<n;++i){
            path[cursor++]=i;
            dfs(ans, nums, path, cursor, n, k);
            cursor--;
        }
    }
}
