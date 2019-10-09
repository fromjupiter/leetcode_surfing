package onehd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kexiang on 2019/10/7.
 */
public class SubsetsTwo_90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
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
            while(i<n-1 && nums[i]==nums[i+1]) ++i;
        }
    }
}
