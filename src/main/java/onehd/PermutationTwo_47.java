package onehd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Kexiang on 2019/9/23.
 */
public class PermutationTwo_47 {
    /**
     * basic dfs
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, new boolean[nums.length], 0, new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(int[] nums, boolean[] visited, int curr, List<Integer> path, List<List<Integer>> ans) {
        if(curr==nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }
        HashSet<Integer> dups = new HashSet<>();
        for(int i=0;i<nums.length;++i){
            if(!visited[i] && !dups.contains(nums[i])){
                dups.add(nums[i]);
                visited[i] = true;
                path.add(nums[i]);
                dfs(nums, visited, curr+1, path, ans);
                visited[i] = false;
                path.remove(path.size()-1);
            }
        }
    }
}
